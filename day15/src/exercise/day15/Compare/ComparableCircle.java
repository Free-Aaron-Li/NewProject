package exercise.day15.Compare;

/**
 * @projectName: newJavaProject
 * @className: ComparableCircle
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/5/4 19:40
 * @version: JDK17
 */
public class ComparableCircle extends Circle implements CompareObject {
    public ComparableCircle(Double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof ComparableCircle) {
            ComparableCircle comparableCircle = (ComparableCircle) o;
            //有精度损失，不合适
            //return (int)(this.getRadius()-comparableCircle.getRadius());

            //方式一：
            //if (this.getRadius() > comparableCircle.getRadius()) {
            //    return 1;
            //} else if (this.getRadius() < comparableCircle.getRadius()) {
            //    return -1;
            //} else {
            //    return 0;
            //}

            //方式二：当属性radius声明为Double类型时，可以调用包装类的方法
            return this.getRadius().compareTo(comparableCircle.getRadius());
        } else {
            //return 0;
            throw new RuntimeException("传入的数据类型不匹配！！");
        }
    }
}
