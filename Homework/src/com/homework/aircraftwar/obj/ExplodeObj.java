package com.homework.aircraftwar.obj;

import com.homework.aircraftwar.utils.GameUtils;

import java.awt.*;

/**
 * @projectName: untitled1
 * @className: ExplodeObj
 * @author: AaronLi
 * @description: 爆炸实体类
 * @date: 2022/6/22 上午10:27
 * @version: JDK17
 */
public class ExplodeObj extends GameObj {

    //实现爆炸动画，定义img数组
    static Image[] pictures = new Image[16];

    //爆炸效果图只能出现一次，所以定义变量
    int explodeCount = 0;

    static {
        for (int i = 0; i < pictures.length; i++) {
            pictures[i] = Toolkit.getDefaultToolkit().getImage(GameUtils.class.getClassLoader().getResource("imgs/explode/e"+(i+1)+".gif"));
        }
    }

    public ExplodeObj(int x, int y) {
        super(x, y);
    }

    @Override
    public void paintSelf(Graphics gImage) {
        if (explodeCount < 16) {
            img = pictures[explodeCount];
            super.paintSelf(gImage);
            explodeCount++;
        }
    }
}
