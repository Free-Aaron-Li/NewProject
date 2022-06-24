package com.homework.aircraftwar.obj;

import com.homework.aircraftwar.GameWin;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @projectName: untitled1
 * @className: PlaneObj
 * @author: AaronLi
 * @description: 我方战斗机
 * @date: 2022/6/21 下午5:20
 * @version: JDK17
 */
public class PlaneObj extends GameObj {
    @Override
    public Image getImg() {
        return super.getImg();
    }


    public PlaneObj(Image img, int x, int y, int width, int height, double speed, GameWin frame) {
        super(img, x, y, width, height, speed, frame);
        this.frame.addKeyListener(new KeyAdapter() {
            //通过键盘左右键移动战斗机,并设置边界
            @Override
            public void keyPressed(KeyEvent e) {
                switch ((e.getKeyCode())) {
                    case KeyEvent.VK_LEFT:
                        if(PlaneObj.super.x>-2){
                            PlaneObj.super.x-=getSpeed();
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if(PlaneObj.super.x<=580){
                            PlaneObj.super.x+=getSpeed();
                        }
                        break;
                    case KeyEvent.VK_UP:
                        if(PlaneObj.super.y>20){
                            PlaneObj.super.y-=getSpeed();
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        if(PlaneObj.super.y<577){
                            PlaneObj.super.y+=getSpeed();
                        }
                        break;
                }
            }
        });
    }



    @Override
    public void paintSelf(Graphics g) {
        super.paintSelf(g);
        //我方飞机与敌方Boss的碰撞检测
        if(this.frame.bossObj != null && this.getRec().intersects(this.frame.bossObj.getRec())){
            GameWin.state=3;
        }
    }


    @Override
    public Rectangle getRec() {
        return super.getRec();
    }
}
