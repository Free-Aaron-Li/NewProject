package com.experience.project.otherproject01.obj;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 17 - 下午6:06
 * @project: NewProject
 * @version: JDK17.0.2
 */

import com.experience.project.otherproject01.GameWin;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @ClassName PlaneObj
 * @Description Java飞机大战战斗机
 * @Author Aaron-Li
 * @Date 2022 - 02 - 17 - 下午6:06
 * @Version JDK17
 */
public class PlaneObj extends GameObj {
    public PlaneObj() {
        super();
    }

    public PlaneObj(Image img, int x, int y, int width, int height, double speed, GameWin frame) {
        super(img, x, y, width, height, speed, frame);
        this.frame.addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {
                //飞机的横坐标等于光标的横坐标减去飞机的宽度的一半
                PlaneObj.super.x = e.getX() - 11;
                //飞机的纵坐标等于光标的纵坐标减去飞机的高度的一半
                PlaneObj.super.y = e.getY() - 16;
            }
        });
    }

    @Override
    public Image getImg() {
        return super.getImg();
    }

    @Override
    public void paintSelf(Graphics gImage) {
        super.paintSelf(gImage);
        //敌方Boss与我方战斗及碰撞检测
        if (this.frame.bossObj != null && this.getRec().intersects(this.frame.bossObj.getRec())) {
            GameWin.state = 3;
        }
    }

    @Override
    public Rectangle getRec() {
        return super.getRec();
    }
}
