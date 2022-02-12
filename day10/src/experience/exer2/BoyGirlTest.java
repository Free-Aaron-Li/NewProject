package experience.exer2;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 10 - 下午3:26
 * @project: untitled1
 * @version: JDK17.0.2
 */

/**
 * @ClassName BoyGirlTest
 * @Description Boy和Girl的测试
 * @Author Aaron-Li
 * @Date 2022 - 02 - 10 - 下午3:26
 * @Version 117
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy =new Boy("罗密欧",21);
        boy.shout();
        Girl girl=new Girl("朱丽叶",18);
        girl.marry(boy);
        Girl girlOne=new Girl("祝英台",19);
        int compare=girl.compare(girlOne);
        if(compare>0){
            System.out.println(girl.getName()+"大");
        }else if(compare<0){
            System.out.println(girlOne.getName()+"大");
        }else{
            System.out.println("一样大");
        }
    }
}
