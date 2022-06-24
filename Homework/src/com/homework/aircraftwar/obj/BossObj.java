package com.homework.aircraftwar.obj;

import com.homework.aircraftwar.GameWin;
import com.homework.aircraftwar.utils.GameUtils;

import java.awt.*;

/**
 * @projectName: untitled1
 * @className: BossObj
 * @author: AaronLi
 * @description: boss类
 * @date: 2022/6/22 上午8:09
 * @version: JDK17
 */
public class BossObj extends GameObj {

    //Boss生命值
    int life = 10;

    @Override
    public Image getImg() {
        return super.getImg();
    }


    public BossObj(Image img, int x, int y, int width, int height, double speed, GameWin frame) {
        super(img, x, y, width, height, speed, frame);
    }

    @Override
    public void paintSelf(Graphics gImage) {
        super.paintSelf(gImage);
        //boss碰墙，返回
        if (x > 550 || x < -50) {
            speed = -speed;
        }
        //boss左右移动
        x += speed;
        //遍历shellObjList,我方战斗机子弹与敌方Boss的碰撞检测，并对Boss生命值进行调整
        for (ShellObj shellObj : GameUtils.shellObjList) {
            if (this.getRec().intersects(shellObj.getRec())) {
                shellObj.setX(-600);
                shellObj.setY(600);
                GameUtils.removeList.add(shellObj);
                life--;
            }
            if (life == 0) {
                //游戏胜利
                GameWin.state = 4;
            }
        }

       /*
       敌方Boss“血条”
        */

        //“血条”背景：白色
        gImage.setColor(Color.white);
        gImage.fillRect(30, 70, 100, 8);

        //“血条”绘制
        gImage.setColor(Color.RED);
        gImage.fillRect(30, 70, life * 100 / 10, 8);
    }

    @Override
    public Rectangle getRec() {
        return super.getRec();
    }
}
