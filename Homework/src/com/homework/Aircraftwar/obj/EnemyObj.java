package com.homework.Aircraftwar.obj;

import com.homework.Aircraftwar.GameWin;
import com.homework.Aircraftwar.utils.GameUtils;

import java.awt.*;

/**
 * @projectName: untitled1
 * @className: EnemyObj
 * @author: AaronLi
 * @description: 敌方战斗机
 * @date: 2022/6/21 下午9:10
 * @version: JDK17
 */
public class EnemyObj extends GameObj {
    @Override
    public Image getImg() {
        return super.getImg();
    }

    public EnemyObj(Image img, int x, int y, int width, int height, double speed, GameWin frame) {
        super(img, x, y, width, height, speed, frame);
    }

    @Override
    public void paintSelf(Graphics gImage) {
        super.paintSelf(gImage);
        y += speed;
        //敌方战斗机与我方战斗机碰撞检测
        if (this.getRec().intersects(this.frame.planeObj.getRec())) {
            //游戏状态更改为3，游戏失败
            GameWin.state = 3;
        }
        //遍历我方战斗机子弹集合，进行碰撞检测
        for (ShellObj shellObj : GameUtils.shellObjList) {
            if (this.getRec().intersects(shellObj.getRec())) {
                //敌方战斗机被我方战斗机子弹击中，产生爆炸动画
                ExplodeObj explodeObj = new ExplodeObj(x, y);
                GameUtils.explodeObjList.add(explodeObj);
                GameUtils.removeList.add(explodeObj);
                //将子弹和敌机坐标位置改变，原因是如果没有改变，虽然子弹和敌机已经存入removeList中了，但是原集合中还保留该坐标，仍然会被检测出来，所以需要改变位置
                shellObj.setX(-600);
                shellObj.setY(600);
                this.x = -600;
                this.y = 600;
                //将已经碰撞的敌机存入removeList中
                GameUtils.removeList.add(shellObj);
                GameUtils.removeList.add(this);
                //计分面板分数递增
                GameWin.score++;
                //敌机被击毁数量递增
                GameWin.enemyCount++;
            }
        }

        //敌方战斗机的越界消失
        if (y > 600) {
            this.y = 610;
            this.x = 610;
            GameUtils.removeList.add(this);
        }
    }

    @Override
    public Rectangle getRec() {
        return super.getRec();
    }
}
