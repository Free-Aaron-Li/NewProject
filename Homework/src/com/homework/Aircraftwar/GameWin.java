package com.homework.Aircraftwar;

import com.homework.Aircraftwar.obj.*;
import com.homework.Aircraftwar.utils.GameUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serial;

import static com.homework.Aircraftwar.utils.GameUtils.enemyObjList;
import static java.awt.Color.RED;

/**
 * @projectName: untitled1
 * @className: GameWin
 * @author: AaronLi
 * @description: 飞机大战窗口及主程序
 * @date: 2022/6/21 上午8:11
 * @version: JDK17
 */
public class GameWin extends JFrame {

    @Serial
    private static final long serialVersionUID = 2892718312041969750L;

    //设置窗口
    public void launch() {
        //设置窗口是否可见
        this.setVisible(true);
        //设置窗口大小
        this.setSize(600, 600);
        //设置窗口位置
        this.setLocationRelativeTo(null);
        //设置窗口标题
        this.setTitle("飞机大战");
        //添加背景、我方战斗机
        GameUtils.gameObjList.add(bgObj);
        GameUtils.gameObjList.add(planeObj);
        //鼠标点击事件
        this.addMouseListener(new MouseAdapter() {
            //getButton()==1：表示点击的是鼠标左键
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == 1 && state == 0) {
                    //游戏更改为运行状态
                    state = 1;
                    repaint();
                }
            }
        });
        //键盘的监听事件，用于实现游戏暂停
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                //按下空格键
                if (e.getKeyCode() == 32) {
                    switch (state) {
                        case 1 -> state = 2;
                        case 2 -> state = 1;
                    }
                }
            }
        });
        //每秒repaint会调用40次
        while (true) {
            if (state == 1) {
                createObj();
                repaint();
            }
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * @date: 2022/6/21 下午2:55
     * @description: 游戏状态
     * 0：未开始；  1：游戏中； 2：暂停；  3：通关失败；  4：通关成功
     */

    //游戏默认状态
    public static int state = 0;

    //窗口宽、高
    int window_width = 600;
    int window_height = 600;

    /**
     * @date: 2022/6/21 下午5:00
     * @description: 双缓冲技术
     * java双缓冲技术是一种解决闪屏的技术，首先来看看闪屏是因为什么产生的？
     * <p>
     * 图像画到屏幕上的过程是：AWT->update()->paint()，有时候通过repaint()来调用paint()，其实也是产生了一个
     * AWT线程，然后通过AWT线程来调用update()，再由update()来调用paint()。
     * 闪屏：update()在每次调用之前会有一个清屏，这就是闪烁产生的原因。
     * <p>
     * 此外，闪屏还与线程睡眠时间有关，睡眠时间越短，闪烁显现就越严重。因为显示器的刷新频率高于程序，paint()方法还没来得及画完整幅画面。
     * </p>
     * <p>
     * Java中，可以通过createImage()创建一幅屏幕外的图像(存在内存中)，可以通过Image.getGraphics()来获取一个用来绘制屏幕外图像的画笔。
     * 在第二幅图片绘画之前必须清空第一幅图片，要不然两张图片就会重合产生交叉，这也就是update()清屏的原因。
     * <p>
     * 但是不能直接在屏幕上清屏，所以，可以通过gImage.clearRect(0, 0, 0，0),将前一幅图片在内存中清空，或者gImage.fillRect(0,0,0,0)，将前一副图片覆盖，这样就不会影响到屏幕了，
     * 然后再将图像画到屏幕外的图像上，最后将将屏幕外的图像画到屏幕上，就实现了画图的功能。
     * <p>
     * 同时，双缓存技术还可以解决移动图片卡顿现象
     */
    Image offScreenImage = null;

    /**
     * @date: 2022/6/21 下午4:23
     * @description: 创建背景图对象，用于背景图移动。y=-2006：背景图自上向下移动，背景图高为2666，界面大小为600
     */
    BgObj bgObj = new BgObj(GameUtils.bgImg, 0, -2066, 2);

    /**
     * @date: 2022/6/21 下午5:23
     * @description: 创建我方战斗机的对象, plane（22*33），速度为20
     */
    public PlaneObj planeObj = new PlaneObj(GameUtils.planeImg, 289, 567, 22, 33, 20, this);

    /**
     * @date: 2022/6/22 上午8:10
     * @description: 创建Boss对象，boss（100*76）
     */
    public BossObj bossObj = null;

    /**
     * @date: 2022/6/21 下午9:05
     * @description: 游戏重绘次数（防止子弹数过量）
     */

    int count = 1;

    /**
     * @date: 2022/6/22 上午8:52
     * @description: 创建计分面板分数对象
     */
    public static int score = 0;

    /**
     * @date: 2022/6/22 上午9:24
     * @description: 创建敌方战斗机数量变量（用于当敌机被摧毁100架后，Boss才出现）
     */
    public static int enemyCount = 0;

    /**
     * @date: 2022/6/21 上午8:43
     * @description: 绘制指定图像中已缩放到适合指定矩形内部的图像。
     * <p>
     * 图像绘制在此图形上下文坐标空间的指定矩形内部，并且如果需要，则进行缩放，透明像素不影响该处已存在的像素。
     */

    @Override
    public void paint(Graphics g) {
        //双缓冲技术
        if (offScreenImage == null) {
            offScreenImage = createImage(window_width, window_height);
        }
        Graphics gImage = offScreenImage.getGraphics();
        gImage.fillRect(0, 0, window_width, window_height);

        //游戏未开始时
        if (state == 0) {

            /*
            背景图
             */

            //绘制背景（坐标（0，0）、大小（600*600））
            gImage.drawImage(GameUtils.bgImg, 0, 0, window_width, window_height, this);
            //绘制Boss（100*76）
            gImage.drawImage(GameUtils.bossImg, 250, 120, this);
            //绘制爆炸（e6）（71*100）
            gImage.drawImage(GameUtils.explodeImg, 265, 350, this);

            /*
            字体
             */

            GameUtils.drawWord(gImage, Color.yellow, "微软雅黑", "开始游戏", 40, 215, 300);
        }

        //游戏开始运行
        if (state == 1) {//将我方战斗机、我方战斗机子弹、背景图一起绘制，降低耦合度
            //绘制敌方爆炸动画
            GameUtils.gameObjList.addAll(GameUtils.explodeObjList);
            for (int i = 0; i < GameUtils.gameObjList.size(); i++) {
                GameUtils.gameObjList.get(i).paintSelf(gImage);
            }
            //删除已碰撞的元素
            GameUtils.gameObjList.removeAll(GameUtils.removeList);


           /*
           计分面板
           */

            GameUtils.drawWord(gImage, Color.GREEN, "微软雅黑", score + "分", 20, 30, 100);
        }

        //游戏失败
        if (state == 3) {

            /*
            背景图
             */

            //绘制我方战斗机爆炸，我方战斗机（22*23），爆炸图e8（71*100）
            gImage.drawImage(GameUtils.bgImg, bgObj.getX(), bgObj.getY(), this);
            gImage.drawImage(GameUtils.planeImg, planeObj.getX(), planeObj.getY(), this);
            gImage.drawImage(GameUtils.explodeE8Img, planeObj.getX() - 35, planeObj.getY() - 50, this);

            /*
            字体
             */

            GameUtils.drawWord(gImage, RED, "微软雅黑", "游戏失败", 40, 215, 300);
        }

        //游戏胜利
        if (state == 4) {

            /*
            背景图
             */

            //绘制敌方Boss爆炸图
            gImage.drawImage(GameUtils.bgImg, bgObj.getX(), bgObj.getY(), this);
            gImage.drawImage(GameUtils.bossImg, bossObj.getX(), bossObj.getY(), this);

            /*
            字体
             */

            GameUtils.drawWord(gImage, RED, "微软雅黑", "游戏胜利", 40, 215, 300);
        }

        g.drawImage(offScreenImage, 0, 0, this);

        //游戏重绘次数
        count++;

        //gameObjList长度
        //System.out.println(GameUtils.gameObjList.size());
    }

    /**
     * @date: 2022/6/21 下午8:00
     * @description: 创建我方战斗机和敌方战斗机、敌方boss子弹对象集合，bulletGreen（15*15）,速度为5，敌方战斗机（49*36），速度为5
     */
    void createObj() {
        /*
        我方
         */

        //经过15次重绘，才会生成一颗子弹
        if (count % 15 == 0) {
            //通过匿名对象方式，添加子弹
            GameUtils.shellObjList.add(new ShellObj(GameUtils.shellImg, planeObj.getX() + 2, planeObj.getY() - 25, 15, 15, 5, this));
            //通过索引获取shellObjList最后一个元素，添加至GameObjList中
            GameUtils.gameObjList.add(GameUtils.shellObjList.get(GameUtils.shellObjList.size() - 1));
        }

        /*
        敌方
         */

        //敌方战斗机
        if (count % 15 == 0) {
            //敌方战斗机（49*36），窗口宽600，所以越可以并排12架敌方战斗机
            enemyObjList.add(new EnemyObj(GameUtils.enemyImg, (int) (Math.random() * 12) * 50, 0, 49, 36, 5, this));
            GameUtils.gameObjList.add(GameUtils.enemyObjList.get(GameUtils.enemyObjList.size() - 1));
        }

        //敌方boss子弹，Boss（100*76），子弹（15*15）
        if (count % 15 == 0 && bossObj != null) {
            GameUtils.bulletObjList.add(new BulletObj(GameUtils.bulletImg, bossObj.getX() + 42, bossObj.getY() + 76, 15, 15, 5, this));
            GameUtils.gameObjList.add(GameUtils.bulletObjList.get(GameUtils.bulletObjList.size() - 1));
        }

        //当敌方战斗机被击毁数量超过100架，敌方Boss才会出现
        if (enemyCount > 1 && bossObj == null) {
            bossObj = new BossObj(GameUtils.bossImg, 250, 0, 100, 76, 5, this);
            GameUtils.gameObjList.add(bossObj);
        }
    }

    public static void main(String[] args) {
        GameWin gameWin = new GameWin();
        gameWin.launch();
    }
}
