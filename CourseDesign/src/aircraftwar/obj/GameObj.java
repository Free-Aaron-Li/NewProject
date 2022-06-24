package aircraftwar.obj;

import aircraftwar.GameWin;

import java.awt.*;

/**
 * @projectName: untitled1
 * @className: GameObj
 * @author: AaronLi
 * @description: 游戏父类
 * @date: 2022/6/21 下午3:55
 * @version: JDK17
 */
public class GameObj {
    //物体图片
    Image img;

    //物体坐标
    int x;
    int y;

    //物体大小
    int width;
    int height;

    //物体速度
    double speed;

    //窗口引用
    GameWin frame;

    public Image getImg() {
        return img;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getSpeed() {
        return speed;
    }

    public GameObj() {
    }

    public GameObj(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public GameObj(Image img, int x, int y, double speed) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public GameObj(Image img, int x, int y) {
        this.img = img;
        this.x = x;
        this.y = y;
    }

    public GameObj(Image img, int x, int y, int width, int height, double speed, GameWin frame) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.frame = frame;
    }

    //绘制自身方法
    public void paintSelf(Graphics gImage) {
        gImage.drawImage(img, x, y, null);
    }

    /**
     * @param:  no
     * @return: Rectangle()
     * @date: 2022/6/21 下午4:13
     * @description: Rectangle:定义一个矩形的区域，x，y：该区域的x、y坐标；width，height：该区域的宽、高。
     */
    //获取自身矩形（用于碰撞检测）
    public Rectangle getRec() {
        return new Rectangle(x, y, width, height);
    }
}
