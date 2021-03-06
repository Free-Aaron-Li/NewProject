package com.experience.project.otherproject01.obj;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 17 - 下午7:20
 * @project: NewProject
 * @version: JDK17.0.2
 */

import com.experience.project.otherproject01.GameWin;
import com.experience.project.otherproject01.utils.GameUtils;

import java.awt.*;

/**
 * @ClassName ShellObj
 * @Description Java飞机大战-我方飞机子弹添加
 * @Author Aaron-Li
 * @Date 2022 - 02 - 17 - 下午7:20
 * @Version JDK17
 */
public class ShellObj extends GameObj{
    public ShellObj() {
        super();
    }

    public ShellObj(Image img, int x, int y, int width, int height, double speed, GameWin frame) {
        super(img, x, y, width, height, speed, frame);
    }

    @Override
    public Image getImg() {
        return super.getImg();
    }

    @Override
    public void paintSelf(Graphics gImage) {
        super.paintSelf(gImage);
        y-=speed;
        //我方子弹的越界消失，条件：y<0,改变后坐标（-100,100）
        if(y<0){
            this.x=-100;
            this.y=100;
            GameUtils.removeList.add(this);
        }
    }

    @Override
    public Rectangle getRec() {
        return super.getRec();
    }
}
