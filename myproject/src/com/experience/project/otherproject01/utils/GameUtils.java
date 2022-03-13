/*
 * @Description:
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-02-17 15:11:40
 * @LastEditTime: 2022-03-13 20:16:15
 */
package com.experience.project.otherproject01.utils;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 17 - 下午3:11
 * @project: NewProject
 * @version: JDK17.0.2
 */

import com.experience.project.otherproject01.obj.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GameUtils
 * @Description Java飞机大战工具类
 * @Author Aaron-Li
 * @Date 2022 - 02 - 17 - 下午3:11
 * @Version JDK17
 */
public class GameUtils {
    //背景图片
    public static Image bgImg = Toolkit.getDefaultToolkit().getImage("/home/Aaron-Li/Clone/newJavaProject/NewProject/imgs/bg.jpg");
    //boss图片
    public static Image bossImg = Toolkit.getDefaultToolkit().getImage("/home/Aaron-Li/Clone/newJavaProject/NewProject/imgs/boss.png");
    //爆炸图片
    public static Image explodeImg = Toolkit.getDefaultToolkit().getImage("/home/Aaron-Li/Clone/newJavaProject/NewProject/imgs/explode/e6.gif");
    //爆炸图片1
    public static Image explodeOneImg = Toolkit.getDefaultToolkit().getImage("/home/Aaron-Li/Clone/newJavaProject/NewProject/imgs/explode/e10.gif");
    //战斗机图片
    public static Image planeImg = Toolkit.getDefaultToolkit().getImage("/home/Aaron-Li/Clone/newJavaProject/NewProject/imgs/plane.png");
    //我方子弹图片
    public static Image shellImg = Toolkit.getDefaultToolkit().getImage("/home/Aaron-Li/Clone/newJavaProject/NewProject/imgs/bulletGreen.png");
    //敌方子弹图片
    public static Image bulletImg = Toolkit.getDefaultToolkit().getImage("/home/Aaron-Li/Clone/newJavaProject/NewProject/imgs/bulletYellow.png");
    //敌机图片
    public static Image enemyImg = Toolkit.getDefaultToolkit().getImage("/home/Aaron-Li/Clone/newJavaProject/NewProject/imgs/enemy.png");
    //要删除的元素集合
    public static List<GameObj> removeList = new ArrayList<>();
    //所有游戏物体集合
    public static List<GameObj> gameObjList = new ArrayList<>();
    //我方战机子弹集合
    public static List<ShellObj> shellObjList = new ArrayList<>();
    //敌方战机子弹集合
    public static List<BulletObj> bulletObjList = new ArrayList<>();
    //敌机集合
    public static List<EnemyObj> EnemyObjList = new ArrayList<>();
    //爆炸类集合
    public static List<ExplodeObj> explodeObjList = new ArrayList<>();

    //绘制字符串工具类
    //参数依次为：画笔，要绘制的字符串，字体颜色，字体大小，字符串的位置。
    public static void drawWord(Graphics gImage, String str, Color color, int size, int x, int y) {
        gImage.setColor(color);
        gImage.setFont(new Font("姑苏行书", Font.BOLD, size));
        gImage.drawString(str, x, y);
    }
}
