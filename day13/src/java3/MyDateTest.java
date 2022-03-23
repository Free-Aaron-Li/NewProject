/*
 * @Description: 编写equals()方法 
 * @version: JDK17
 * @Author: Aaron.Li
 * @Date: 2022-03-10 12:53:14
 * @LastEditTime: 2022-03-10 13:17:03
 */
package java3;

public class MyDateTest {
   public static void main(String[] args) {
      MyDate testOne = new MyDate(14, 3, 1976);
      MyDate testTwo = new MyDate(14, 3, 1976);
      if (testOne == testTwo) {
         System.out.println("testOne==testTwo");
      } else {
         System.out.println("testOne!=testTwo");
      }

      if (testOne.equals(testTwo)) {
         System.out.println("testOne is equal to testTwo");
      } else {
         System.out.println("testOne is not equal to testTwo");
      }
   }
}

class MyDate {
   private int day;
   private int month;
   private int year;

   public MyDate(int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public int getDay() {
      return day;
   }

   public void setDay(int day) {
      this.day = day;
   }

   public int getMonth() {
      return month;
   }

   public void setMonth(int month) {
      this.month = month;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   // 手动重写equals方法
   public boolean equals(Object obj) {
      // ①判断是否是位于同一个地址
      if (this == obj) {
         return true;
      }
      // ②判断obj是否属于同一个类
      if (obj instanceof MyDate) {
         MyDate myDate = (MyDate) obj;
         return this.day == myDate.day && this.month == myDate.month && this.year == myDate.year;
      }
      return false;
   }
   // 自动生成equals方法
   // @Override
   // public boolean equals(Object obj) {
   // if (this == obj)
   // return true;
   // if (obj == null)
   // return false;
   // if (getClass() != obj.getClass())
   // return false;
   // MyDate other = (MyDate) obj;
   // if (day != other.day)
   // return false;
   // if (month != other.month)
   // return false;
   // if (year != other.year)
   // return false;
   // return true;
   // }

}
