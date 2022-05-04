package exercise.day15.Compare;

/**
 * @projectName: newJavaProject
 * @className: CompareObject
 * @author: AaronLi
 * @description:
 * 定义一个接口用来实现两个对象的比较。
 * @date: 2022/5/4 19:31
 * @version: JDK17
 */
public interface CompareObject {
    //若返回值是0，代表相等；若为正数，代表前对象大；负数代表当前对象小。
    int compareTo(Object o);
}
