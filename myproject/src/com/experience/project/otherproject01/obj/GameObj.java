package com.experience.project.otherproject01.obj;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 17 - 下午5:16
 * @project: NewProject
 * @version: JDK17.0.2
 */

import com.experience.project.otherproject01.GameWin;

import java.awt.*;

/**
 * @ClassName GameObj
 * @Description Java飞机大战父类
 * @Author Aaron-Li
 * @Date 2022 - 02 - 17 - 下午5:16
 * @Version JDK17
 */
public class GameObj {
    Image img;
    int x;
    int y;
    int width;
    int height;
    double speed;
    GameWin frame;

    public GameObj(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public GameObj() {

    }

    public GameObj(Image img, int x, int y, double speed) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public GameObj(Image img, int x, int y, int width, int height, double speed, GameWin frame) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.frame = frame;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSeed(double speed) {
        this.speed = speed;
    }

    public GameWin getFrame() {
        return frame;
    }

    public void setFrame(GameWin frame) {
        this.frame = frame;
    }

    /**
     * @Description 方法
     */
    public void paintSelf(Graphics gImage) {
        gImage.drawImage(img, x, y, null);
    }

    /**
     * 获取自身体积方法，用于碰撞检测
     *
     * @return 自身体积大小
     */
    public Rectangle getRec() {
        return new Rectangle(x, y, width, height);
    }
}
