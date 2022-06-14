import java.util.LinkedList;

/**
 * @projectName: newJavaProject
 * @className: E
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/13 15:19
 * @version: JDK17
 */
public class E {
    public static void main(String args[]) {
        LinkedList< Integer> list=new LinkedList< Integer>();
        for(int k=1;k<=10;k++) {
            //list.add(new Integer(k));
        }
        list.remove(5);
        list.remove(5);
        Integer m=list.get(5);
        System.out.println(m.intValue());
        int k=0;
        for (int i = 0; i < 10; i++) {
           k=i;
            if (i==5) { break; }
        }
        System.out.println(k);
    }
}

