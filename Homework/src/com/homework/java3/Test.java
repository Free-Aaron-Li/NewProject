package com.homework.java3;

import java.util.*;

/**
 * @projectName: newJavaProject
 * @className: Test
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 21:36
 * @version: JDK17
 */
public class Test {
    public static void main(String[] args) {
        Person persons[] = {
                new Student("001", "张三", "01"),
                new Student("002", "李四", "02"),
                new Student("003", "王五", "03"),
                new Teacher("004", "张老师", "04"),
                new Teacher("005", "李老师", "05")};

        List<Person> list = new ArrayList<Person>();
        Set<Person> set = new HashSet<Person>();
        Map<String, Person> map = new HashMap<String, Person>();
        for (Person person : persons) {
            list.add(person);
            set.add(person);
            if (person instanceof Student) {
                map.put(((Student) person).sno, person);
            }
        }
        System.out.println("-------------list------------");
        show(list);
        list.remove(persons[1]);
        set.remove(persons[1]);
        System.out.println("-------------list-------------");
        show(list);
        System.out.println("--------------set-------------");
        show(set);
        System.out.println("--------------map-------------");
        show(map);
        System.out.println("--------------set-------------");
        show(set);
        System.out.println("--------------set------------");
        set.add(persons[2]);
        show(set);
    }

    static void show(Collection<Person> c) {
        for (Person person : c) {
            System.out.println(person);
            person.eat();
        }
    }

    static void show(Map<String, Person> m) {
        for (String key : m.keySet()) {
            Person p = m.get(key);
            System.out.println(p);
            if (p instanceof Student) {
                ((Student) p).study();
            }
        }
    }
}
