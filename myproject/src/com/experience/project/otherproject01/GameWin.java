package com.experience.project.otherproject01;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 17 - 下午3:04
 * @project: NewProject
 * @version: JDK17.0.2
 */

import com.experience.project.otherproject01.obj.BgObj;
import com.experience.project.otherproject01.obj.PlaneObj;
import com.experience.project.otherproject01.obj.ShellObj;
import com.experience.project.otherproject01.utils.GameUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static com.experience.project.otherproject01.utils.GameUtils.planeImg;

/**
 * @ClassName GameWin
 * @Description Java飞机大战窗口
 * @Author Aaron-Li
 * @Date 2022 - 02 - 17 - 下午3:04
 * @Version JDK17
 */
public class GameWin extends JFrame {
    /**
     * @Description 游戏状态：0：未开始游戏、1：游戏中、2：暂停游戏、3：通关失败、4：通关成功
     */
    //游戏默认状态
    static int state = 0;
    Image offScreenImage = null;
    int width = 384;
    int height = 600;
    //背景图对象
    BgObj bgObj = new BgObj(GameUtils.bgImg, 0, -429, 2);

    //我方战斗机
    PlaneObj planeObj = new PlaneObj(GameUtils.planeImg, 290, 550, 20, 30, 0, this);
//我方子弹
    ShellObj shellObj=new ShellObj(GameUtils.shellImg,planeObj.getX()+3,planeObj.getY(),14,20,5,this);
    public void launch() {
        //设置窗口是否可见
        this.setVisible(true);
        //设置窗口大小
        this.setSize(width, height);
        //设置窗口位置
        this.setLocationRelativeTo(null);
        //设置窗口标题
        this.setTitle("飞机大战1.0");
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
        while (true) {
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
            gImage.setColor(Color.yellow);
            gImage.setFont(new Font("姑苏行书", Font.BOLD, 40));
            gImage.drawString("开始游戏", 110, 300);
        }
        if (state == 1) {//背景图片移动
            bgObj.paintSelf(gImage);
            planeObj.paintSelf(gImage);
            shellObj.paintSelf(gImage);
        }
        g.drawImage(offScreenImage, 0, 0, null);
    }

    public static void main(String[] args) {
        GameWin test = new GameWin();
        test.launch();
    }
}
