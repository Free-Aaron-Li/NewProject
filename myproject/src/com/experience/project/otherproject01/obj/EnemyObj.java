package com.experience.project.otherproject01.obj;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 18 - 上午8:44
 * @project: NewProject
 * @version: JDK17.0.2
 */

import com.experience.project.otherproject01.GameWin;
import com.experience.project.otherproject01.utils.GameUtils;

import java.awt.*;

/**
 * @ClassName EnemyObj
 * @Description Java飞机大战 敌机添加
 * @Author Aaron-Li
 * @Date 2022 - 02 - 18 - 上午8:44
 * @Version JDK17
 */
public class EnemyObj extends GameObj {
    public EnemyObj() {
        super();
    }

    public EnemyObj(Image img, int x, int y, int width, int height, double speed, GameWin frame) {
        super(img, x, y, width, height, speed, frame);
    }

    @Override
    public void paintSelf(Graphics gImage) {
        super.paintSelf(gImage);
        y += speed;

        //敌机与我方飞机碰撞检测
        if (this.getRec().intersects(this.frame.planeObj.getRec())) {
            GameWin.state = 3;//碰撞成功，游戏失败
        }
        //敌机的越界消失，判断条件：y>600,改变后坐标（-200,-200）
        if (y > 600) {
            this.x = -200;
            this.y = 200;
            GameUtils.removeList.add(this);
        }
        //敌机消失前移动到（-200,-200） 我方飞机移动到（-100,100）
        //碰撞检测：查看两张图片是否重叠
        for (ShellObj shellObj : GameUtils.shellObjList) {
            if (this.getRec().intersects(shellObj.getRec())) {
                ExplodeObj explodeObj = new ExplodeObj(x, y);
                GameUtils.explodeObjList.add(explodeObj);
                GameUtils.removeList.add(explodeObj);
                shellObj.setX(-100);
                shellObj.setY(100);
                this.x = -200;
                this.y = 200;
                GameUtils.removeList.add(shellObj);
                GameUtils.removeList.add(this);
                //碰撞敌机，分数+1
                GameWin.score++;
            }
        }
    }

    @Override
    public Rectangle getRec() {
        return super.getRec();
    }
}
