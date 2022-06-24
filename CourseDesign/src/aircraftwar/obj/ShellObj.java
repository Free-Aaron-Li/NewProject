package aircraftwar.obj;

import aircraftwar.GameWin;
import aircraftwar.utils.GameUtils;

import java.awt.*;

/**
 * @projectName: untitled1
 * @className: ShellObj
 * @author: AaronLi
 * @description: 子弹类
 * @date: 2022/6/21 下午7:56
 * @version: JDK17
 */
public class ShellObj extends GameObj {
    @Override
    public Image getImg() {
        return super.getImg();
    }

    public ShellObj(Image img, int x, int y, int width, int height, double speed, GameWin frame) {
        super(img, x, y, width, height, speed, frame);
    }

    @Override
    public void paintSelf(Graphics gImage) {
        super.paintSelf(gImage);
        y -= speed;
        //当我方战斗机子弹已经不存在窗口中，删除子弹
        if(y<0){
            this.x=-600;
            this.y=600;
            GameUtils.removeList.add(this);
        }
    }

    @Override
    public Rectangle getRec() {
        return super.getRec();
    }
}
