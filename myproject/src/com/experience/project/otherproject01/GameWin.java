package com.experience.project.otherproject01;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 17 - 下午3:04
 * @project: NewProject
 * @version: JDK17.0.2
 */

import com.experience.project.otherproject01.obj.*;
import com.experience.project.otherproject01.utils.GameUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @ClassName GameWin
 * @Description Java飞机大战窗口
 * @Author Aaron-Li
 * @Date 2022 - 02 - 17 - 下午3:04
 * @Version JDK17
 */

/**
 * 注意：我方子弹、敌方子弹、敌方飞机坐标不能重复，否则会碰撞检查错误
 */
public class GameWin extends JFrame {
    /**
     * @Description 游戏状态：0：未开始游戏、1：游戏中、2：暂停游戏、3：通关失败、4：通关成功
     */
    //游戏默认状态
    public static int state = 0;
    //积分初始值
    public static int score = 0;
    Image offScreenImage = null;
    //窗口宽度
    int width = 384;
    //窗口高度
    int height = 600;
    //背景图对象
    BgObj bgObj = new BgObj(GameUtils.bgImg, 0, -429, 2);
    //游戏重绘次数，调节子弹发射速度
    int count = 1;
    //敌机数量
    int enemyCount = 0;
    //我方战斗机对象
    public PlaneObj planeObj = new PlaneObj(GameUtils.planeImg, 290, 550, 20, 30, 0, this);
    //敌方Boss对象
    public BossObj bossObj = null;

    public void launch() {
        //设置窗口是否可见
        this.setVisible(true);
        //设置窗口大小
        this.setSize(width, height);
        //设置窗口位置
        this.setLocationRelativeTo(null);
        //设置窗口标题
        this.setTitle("飞机大战1.0");
        GameUtils.gameObjList.add(bgObj);
        GameUtils.gameObjList.add(planeObj);
        /**
         * @Description 游戏启动界面，启动state=1.
         */
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == 1 && state == 0) {//表示游戏未开始，点击鼠标左键
                    state = 1;
                    repaint();
                }
            }
        });
        //游戏暂停
        this.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 32){//空格键代号为32
                    switch(state){
                        case 0: {
                            state = 1;
                            break;
                        }
                        case 1:{
                            state=0;
                            break;
                        }
                        default:;
                    }
                }
            }
        });
        //重复绘制
        while (true) {
            //加上判断，只有在游戏运行才进行重复绘制
            if (state == 1) {
                createObj();
                repaint();
            }
            //设置一秒调用40此repaint;
            repaint();
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void paint(Graphics g) {
        if (offScreenImage == null) {
            offScreenImage = createImage(width, height);
        }
        Graphics gImage = offScreenImage.getGraphics();
        gImage.fillRect(0, 0, width, height);
        if (state == 0) {
            /**
             * @Description 游戏开始界面（静态）
             */
            //g.drawImage(GameUtils.bgImg,0,0,null);
            //如果多添加一个bgImg,那么因为错位，从而出现背景图变换。星星闪烁。
            gImage.drawImage(GameUtils.bgImg, 0, 15, null);
            gImage.drawImage(GameUtils.bossImg, 133, 120, null);
            gImage.drawImage(GameUtils.explodeImg, 143, 350, null);
            repaint();
            GameUtils.drawWord(gImage, "开始游戏", Color.yellow, 40, 110, 300);
//            gImage.setColor(Color.YELLOW);
//            gImage.setFont(new Font("姑苏行书", Font.BOLD, 40));
//            gImage.drawString("开始游戏", 110, 300);
        }
        if (state == 1) {
            //添加爆炸动图
            GameUtils.gameObjList.addAll(GameUtils.explodeObjList);
            /**
             * @Description 游戏运行界面（动态）
             */
            //背景图片移动
            for (int i = 0; i < GameUtils.gameObjList.size(); i++) {
                GameUtils.gameObjList.get(i).paintSelf(gImage);
            }
            GameUtils.gameObjList.removeAll(GameUtils.removeList);
        }
        if (state == 3) {
            /**
             * @Description 游戏失败界面（静态）
             */
            //g.drawImage(GameUtils.bgImg,0,0,null);
            //如果多添加一个bgImg,那么因为错位，从而出现背景图变换。星星闪烁。
            gImage.drawImage(GameUtils.bgImg, bossObj.getX() -20, bossObj.getY() , null);
            repaint();
            GameUtils.drawWord(gImage, "游戏失败 垃圾！", Color.RED, 40, 50, 300);
//            gImage.setColor(Color.RED);
//            gImage.setFont(new Font("姑苏行书", Font.BOLD, 40));
//            gImage.drawString("游戏失败 垃圾！", 50, 300);//游戏失败 x:110,y=300
        }
        if (state == 4) {
            /**
             * @Description 游戏通过界面（静态）
             */
            //g.drawImage(GameUtils.bgImg,0,0,null);
            //如果多添加一个bgImg,那么因为错位，从而出现背景图变换。星星闪烁。
            gImage.drawImage(GameUtils.bgImg, bossObj.getX() -205, bossObj.getY(), null);
            //gImage.drawImage(GameUtils.explodeOneImg, bossObj.getX()+30, bossObj.getY(), null);
            repaint();
            GameUtils.drawWord(gImage, "成功通过，牛逼！", Color.GREEN, 40, 50, 300);
//            gImage.setColor(Color.RED);
//            gImage.setFont(new Font("姑苏行书", Font.BOLD, 40));
//            gImage.drawString("游戏失败 垃圾！", 50, 300);//游戏失败 x:110,y=300
        }

        //设置分数面板
        if (state == 1) {
            GameUtils.drawWord(gImage, score + "分", Color.GREEN, 25, 0, 60);
            //GameUtils.drawWord(gImage, "生命,20,8,55);
        }
        g.drawImage(offScreenImage, 0, 0, null);
        count++;
        System.out.println(GameUtils.gameObjList.size());
    }

    void createObj() {//分别调整产生子弹方式和敌机方式
        //添加匿名对象，实现连续发射子弹
        //我方子弹
        if (count % 15 == 0) {//每paint刷新15次，产生一个子弹
            GameUtils.shellObjList.add(new ShellObj(GameUtils.shellImg, planeObj.getX() + 3, planeObj.getY(), 14, 20, 5, this));
            GameUtils.gameObjList.add(GameUtils.shellObjList.get(GameUtils.shellObjList.size() - 1));
        }
        if (count % 15 == 0) {//每paint刷新15次，产生一个敌机
            //这里enemyImg的大小为：49*36（大约设置敌机的宽度为50）,窗口宽度为：384,所以设置每列敌机数量大约为7
            GameUtils.EnemyObjList.add(new EnemyObj(GameUtils.enemyImg, (int) ((Math.random() * 7) * 50), 0, 49, 36, 5, this));
            GameUtils.gameObjList.add(GameUtils.EnemyObjList.get(GameUtils.EnemyObjList.size() - 1));
            //敌机数量添加
            enemyCount++;
        }
        if (count % 15 == 0 && bossObj != null) {//每paint刷新15次，产生一个敌方Boss子弹
            GameUtils.bulletObjList.add(new BulletObj(GameUtils.bulletImg, bossObj.getX() + 76, bossObj.getY() + 85, 15, 25, 5, this));
            GameUtils.gameObjList.add(GameUtils.bulletObjList.get(GameUtils.bulletObjList.size() - 1));
        }
        //当敌机数量大于100时，出现Boss
        if (enemyCount >= 1 && bossObj == null) {
            //赋值bossObj
            bossObj = new BossObj(GameUtils.bossImg, 250, 0, 155, 100, 5, this);
            GameUtils.gameObjList.add(bossObj);
        }
    }

    public static void main(String[] args) {
        GameWin test = new GameWin();
        test.launch();
    }
}
