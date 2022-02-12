package experience.experiment.exer1;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 10 - 下午4:16
 * @project: untitled1
 * @version: JDK17.0.2
 */

/**
 * @ClassName CustomerTest
 * @Description Bank测试程序
 * 1)、创建一个Customer,名字是Jane Smith,
 * 他有一个账户为1000元,余额为2000元,年利率为1.23%的账户。
 * 2）、对Jane Smith操作。
 * 存入100元，再取出960元。在取出2000元。
 * 打印Jane Smith的基本信息
 * @Author Aaron-Li
 * @Date 2022 - 02 - 10 - 下午4:16
 * @Version JDK17
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer test = new Customer("Jane","Smith");
        BankAccount account = new BankAccount(1000,2000,0.0123);
        test.setAccount(account);
        test.getAccount().deposit(100);
        test.getAccount().withdraw(960);
        test.getAccount().withdraw(2000);
        System.out.println("____________________________________________________________________________________________");
        System.out.println("Customer ["+test.getLastName()+","+test.getFirstName()+"] has a account: id is "+test.getAccount().getId()+
                ","+"annualInterestRate is "+test.getAccount().getAnnualInterestRate()*100+"% ,"+"balance is "+test.getAccount().getBalance());
    }
}
