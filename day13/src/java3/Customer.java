package java3;

/*
 * @author: Aaron.Li
 * @date: 2022 - 03 - 02 - 下午9:56
 * @project: NewProject
 * @version: JDK17.0.2
 */
/*
 * @ClassName Customer
 * @Description
 * @Author Aaron-Li
 * @Date 2022 - 03 - 02 - 下午9:56
 * @Version
 */
public class Customer {
    private String name;
    private int age;

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 重写equals()，比较两个对象的实体内容是否相同

    // 自动生成equals()方法A
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    // 手动实现equals()方法
    // public boolean equals(Object obj) {
    // if (this == obj) {
    // return true;
    // }
    // if(obj instanceof Customer){
    // Customer cust=(Customer)obj;
    // 比较两个对象的每个属性是否相同
    // if(this.age==cust.age&&this.name.equals(cust.name)){
    // return true;
    // }else{
    // return false;
    // }
    // 或
    // return this.age==cust.age&&this.name.equals(cust.name);
    // }
    // return false;
    // }

    // 手动写：
    // public String toString(){
    // return "Customer[name"+name+",age="+age+"]";
    // }
    // 自动生成：
    @Override
    public String toString() {
        return "Customer [age=" + age + ", name=" + name + "]";
    }
}
