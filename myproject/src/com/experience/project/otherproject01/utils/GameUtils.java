package com.experience.project.otherproject01.utils;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 17 - 下午3:11
 * @project: NewProject
 * @version: JDK17.0.2
 */

import java.awt.*;

/**
 * @ClassName GameUtils
 * @Description Java飞机大战工具类
 * @Author Aaron-Li
 * @Date 2022 - 02 - 17 - 下午3:11
 * @Version JDK17
 */
public class GameUtils {
    //背景图片
    public static Image bgImg=Toolkit.getDefaultToolkit().getImage("imgs/bg.jpg");
    //boss图片
    public static Image bossImg=Toolkit.getDefaultToolkit().getImage("imgs/boss.png");
    //爆炸图片
    public static Image explodeImg=Toolkit.getDefaultToolkit().getImage("imgs/explode/e6.gif");
    //战斗机图片
    public static Image planeImg=Toolkit.getDefaultToolkit().getImage("imgs/plane.png");
    //我方子弹图片
    public static Image shellImg=Toolkit.getDefaultToolkit().getImage("imgs/bulletGreen.png");
}
