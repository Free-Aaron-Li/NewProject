package com.experience.project.otherproject01.obj;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 18 - 下午12:51
 * @project: NewProject
 * @version: JDK17.0.2
 */

import java.awt.*;

/**
 * @ClassName ExplodeObj
 * @Description Java飞机大战 爆炸效果实体类
 * @Author Aaron-Li
 * @Date 2022 - 02 - 18 - 下午12:51
 * @Version JDK17
 */
public class ExplodeObj extends GameObj{
    //爆炸动画是由一系列静态图快速切换产生的效果
    static Image[] pic =new Image[16];
    static {

        for (int i = 0; i < pic.length; i++) {

        }
    }
    public ExplodeObj(int x, int y) {
        super(x, y);
    }

    @Override

    public void paintSelf(Graphics gImage) {
        super.paintSelf(gImage);
    }
}
