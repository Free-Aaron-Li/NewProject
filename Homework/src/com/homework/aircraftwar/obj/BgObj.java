package com.homework.aircraftwar.obj;

import java.awt.*;

/**
 * @projectName: untitled1
 * @className: BgObj
 * @author: AaronLi
 * @description: 实现背景图片的移动
 * @date: 2022/6/21 下午4:18
 * @version: JDK17
 */
public class BgObj extends GameObj{
    public BgObj() {
        super();
    }

    public BgObj(Image img, int x, int y, double speed) {
        super(img, x, y, speed);
    }

    @Override
    public void paintSelf(Graphics gImage) {
        super.paintSelf(gImage);
        //使之背景图移动
        y+=speed;
        //背景图循环
        if(y>=0){
            y=-2066;
        }
    }
}
