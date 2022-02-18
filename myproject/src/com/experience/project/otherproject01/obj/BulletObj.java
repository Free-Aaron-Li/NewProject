package com.experience.project.otherproject01.obj;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 18 - 上午10:42
 * @project: NewProject
 * @version: JDK17.0.2
 */

import com.experience.project.otherproject01.GameWin;
import com.experience.project.otherproject01.utils.GameUtils;

import java.awt.*;

/**
 * @ClassName BulleObj
 * @Description Java飞机大战 Boss子弹添加
 * @Author Aaron-Li
 * @Date 2022 - 02 - 18 - 上午10:42
 * @Version JDK17
 */
public class BulletObj extends GameObj {
    public BulletObj(Image img, int x, int y, int width, int height, double speed, GameWin frame) {
        super(img, x, y, width, height, speed, frame);
    }

    @Override
    //Boss飞机添加速度
    public void paintSelf(Graphics gImage) {
        super.paintSelf(gImage);
        y += (speed + 1);
        //敌方子弹越界消失，条件：y>600,改变后的坐标（-300,300）
        if(y>600){
            this.x=-300;
            this.y=300;
            GameUtils.removeList.add(this);
        }
        //敌方Boss子弹与我方飞机的碰撞检测
        if (this.frame.bossObj != null && this.getRec().intersects(this.frame.planeObj.getRec())) {
            GameWin.state = 3;
        }
    }

    @Override
    public Rectangle getRec() {
        return super.getRec();
    }
}
