package com.homework.Aircraftwar.utils;

import com.homework.Aircraftwar.obj.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: untitled1
 * @className: GameUtils
 * @author: AaronLi
 * @description: 飞机大战游戏工具类
 * @date: 2022/6/21 上午8:23
 * @version: JDK17
 */
public class GameUtils {

    /**
     * @date: 2022/6/21 上午8:25
     * @description: 获取游戏图片
     */

    //获取背景图片（2000*2666）
    public static Image bgImg = Toolkit.getDefaultToolkit().getImage("D:\\VScodeWorkspace\\newJavaProject\\imgs\\space.jpg");
    //获取Boss图片（100*76）
    public static Image bossImg = Toolkit.getDefaultToolkit().getImage("D:\\VScodeWorkspace\\newJavaProject\\imgs\\boss.png");
    //获取爆炸图片（e6）（71*100）
    public static Image explodeImg = Toolkit.getDefaultToolkit().getImage(" D:\\VScodeWorkspace\\newJavaProject\\imgs\\explode\\e6.gif");
    //获取爆炸图片（e8）（71*100）
    public static Image explodeE8Img = Toolkit.getDefaultToolkit().getImage("D:\\VScodeWorkspace\\newJavaProject\\imgs\\explode\\e8.gif");
    //获取我方战斗机图片（22*33）
    public static Image planeImg = Toolkit.getDefaultToolkit().getImage("D:\\VScodeWorkspace\\newJavaProject\\imgs\\plane.png");
    //获取我方战斗机子弹图片（15*15）
    public static Image shellImg = Toolkit.getDefaultToolkit().getImage("D:\\VScodeWorkspace\\newJavaProject\\imgs\\bulletGreen.png");
    //获取敌方boss子弹图片（15*15）
    public static Image bulletImg = Toolkit.getDefaultToolkit().getImage("D:\\VScodeWorkspace\\newJavaProject\\imgs\\bulletYellow.png");
    //获取敌方战斗机图片（49*36）
    public static Image enemyImg = Toolkit.getDefaultToolkit().getImage("D:\\VScodeWorkspace\\newJavaProject\\imgs\\enemy.png");


    /**
     * @date: 2022/6/21 下午8:09
     * @description: 图片集合
     */

    //所有游戏物品集合
    public static List<GameObj> gameObjList = new ArrayList<>();
    //删除元素集合
    public static List<GameObj> removeList = new ArrayList<>();
    //我方战斗机子弹集合
    public static List<ShellObj> shellObjList = new ArrayList<>();
    //敌方战斗机集合
    public static List<EnemyObj> enemyObjList = new ArrayList<>();
    //敌方boss子弹集合
    public static List<BulletObj> bulletObjList = new ArrayList<>();
    //爆炸类集合
    public static List<ExplodeObj> explodeObjList = new ArrayList<>();
    /**
     * @date: 2022/6/22 上午8:57
     * @description: 创建字符串的工具类
     */
    public static void drawWord(Graphics gImage, Color color, String fontFamily, String str, int size, int x, int y) {
        gImage.setColor(color);
        gImage.setFont(new Font(fontFamily, Font.BOLD, size));
        gImage.drawString(str, x, y);
    }
}

