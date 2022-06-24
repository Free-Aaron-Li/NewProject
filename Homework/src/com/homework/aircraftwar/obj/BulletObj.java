package com.homework.aircraftwar.obj;

import com.homework.aircraftwar.GameWin;
import com.homework.aircraftwar.utils.GameUtils;

import java.awt.*;

/**
 * @projectName: untitled1
 * @className: BulletObj
 * @author: AaronLi
 * @description: 敌方boss子弹
 * @date: 2022/6/22 上午8:19
 * @version: JDK17
 */
public class BulletObj extends GameObj{
    @Override
    public Image getImg() {
        return super.getImg();
    }

    public BulletObj(Image img, int x, int y, int width, int height, double speed, GameWin frame) {
        super(img, x, y, width, height, speed, frame);
    }

    @Override
    public void paintSelf(Graphics gImage) {
        super.paintSelf(gImage);
        y+=speed;
        //boss子弹与我方战斗机的碰撞检测
        if(this.getRec().intersects(this.frame.planeObj.getRec())){
            //游戏失败
            GameWin.state=3;
        }
        //敌方boss子弹的越界小时
        if(y>600){
            this.y=630;
            this.x=630;
            GameUtils.removeList.add(this);
        }
    }

    @Override
    public Rectangle getRec() {
        return super.getRec();
    }
}
