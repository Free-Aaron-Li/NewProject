package com.experience.project.otherproject01.obj;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 17 - 下午5:29
 * @project: NewProject
 * @version: JDK17.0.2
 */

import com.experience.project.otherproject01.GameWin;

import java.awt.*;

/**
 * @ClassName BgObj
 * @Description 继承GameObj
 * @Author Aaron-Li
 * @Date 2022 - 02 - 17 - 下午5:29
 * @Version JDK17
 */
public class BgObj extends GameObj{
    public BgObj(Image img, int x, int y, double speed) {
        super(img, x, y, speed);
    }

    public BgObj(Image img, int x, int y, int width, int height, double speed, GameWin frame) {
        super(img, x, y, width, height, speed, frame);
    }

    @Override
    public void paintSelf(Graphics gImage) {
        super.paintSelf(gImage);
        y+=speed;
        if(y>=0){
            y=-429;
        }
    }
}
