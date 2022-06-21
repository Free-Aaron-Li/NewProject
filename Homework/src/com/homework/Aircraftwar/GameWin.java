package com.homework.Aircraftwar;

import javax.swing.*;
import java.awt.*;

/**
 * @projectName: untitled1
 * @className: GameWin
 * @author: AaronLi
 * @description: 飞机大战窗口及主程序
 * @date: 2022/6/21 上午8:11
 * @version: JDK17
 */
public class GameWin extends JFrame {

    //设置窗口
    public void launch(){
        //设置窗口是否可见
        this.setVisible(true);
        //设置窗口大小
        this.setSize(600,600);
        //设置窗口位置
        this.setLocationRelativeTo(null);
        //设置窗口标题
        this.setTitle("飞机大战");
    }

    @Override
    public void paint(Graphics g) {
        /**
         * @param:
         * @return:
         * @date: 2022/6/21 上午8:43
         * @description:绘制指定图像中已缩放到适合指定矩形内部的图像。
         * 图像绘制在此图形上下文坐标空间的指定矩形内部，并且如果需要，则进行缩放，透明像素不影响该处已存在的像素。
         */

        //绘制背景（坐标（0，0）、大小（600*600））
        g.drawImage(GameUtils.beImg,0,0,600,600,this);

    }

    public static void main(String[] args) {
        GameWin gameWin = new GameWin();
        gameWin.launch();
    }
}
