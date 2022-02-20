package com.experience.project.otherproject01.obj;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 18 - 上午10:31
 * @project: NewProject
 * @version: JDK17.0.2
 */

import com.experience.project.otherproject01.GameWin;
import com.experience.project.otherproject01.utils.GameUtils;

import java.awt.*;

/**
 * @ClassName BossObj
 * @Description Java飞机大战 敌方Boss
 * @Author Aaron-Li
 * @Date 2022 - 02 - 18 - 上午10:31
 * @Version JDK17
 */
public class BossObj extends GameObj {
    //定义一个生命值
    int life = 1;

    public BossObj(Image img, int x, int y, int width, int height, double speed, GameWin frame) {
        super(img, x, y, width, height, speed, frame);
    }

    @Override
    public void paintSelf(Graphics gImage) {
        super.paintSelf(gImage);
        if (x > 450 || x < -50) {//敌方碰到了左右“墙壁”
            speed = -speed;
        }
        x += speed;
        for(ShellObj shellObj:GameUtils.shellObjList){
            if(this.getRec().intersects(shellObj.getRec())){
                //子弹碰撞到Boss,子弹改变位置，消失
                shellObj.setX(-100);
                shellObj.setY(100);
                GameUtils.removeList.add(shellObj);
                life--;
            }
            if(life<=0){
                //游戏进入第四状态，游戏通过
                GameWin.state=4;
            }
        }
    }

    @Override
    public Rectangle getRec() {
        return super.getRec();
    }
}
