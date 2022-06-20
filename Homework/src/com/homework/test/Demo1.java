package com.homework.test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @projectName: newJavaProject
 * @className: Demo1
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/11 16:02
 * @version: JDK17
 */
public class Demo1 {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<String>();
        String[]  names=new String[]{"Tom","Alic","Jack","Mike","Glen"};
        for(String name:names){
            set.add(name);
        }
        Iterator<String> iterator = set.iterator();
        int count=0;
        while(iterator.hasNext()){
            count++;
            if(count<set.size())
                System.out.print(iterator.next()+",");
            else
                System.out.println(iterator.next());
        }
    }

}
