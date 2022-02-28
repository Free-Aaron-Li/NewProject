package com.experience.day13.java4;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 25 - 下午1:33
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName Person
 * @Description 方法的重写的理解父类
 * @Author Aaron-Li
 * @Date 2022 - 02 - 25 - 下午1:33
 * @Version JDK17
 */
public class Person {
  String name;
  int age;
  public Person(){

  }
  public Person(String name,int age){
      this.name = name;
      this.age=age;
  }
  public void eat(){
      System.out.println("吃饭！");
  }
  public void walk(int distance){
      System.out.println("走路，走了 "+distance+" 公里");
  }
  public Object info(){
      return null;
  }
  public double infoOne() {
      return 1;
  }
}
