package experience.experiment.exer2;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 10 - 下午10:06
 * @project: untitled1
 * @version: JDK17.0.2
 */

/**
 * @ClassName BankTest
 * @Description Bank加强版测试
 * @Author Aaron-Li
 * @Date 2022 - 02 - 10 - 下午10:06
 * @Version JDK17
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane", "Smith");
      //给Jane一个余额2000
        bank.getCustomer(0).setAccount(new BankAccount(2000));
        //Jane支出了500
        bank.getCustomer(0).getAccount().withdraw(500);
        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("customer:" + bank.getCustomer(0).getFirstName() + ",balance:" + balance);
        System.out.println("************************************************************************");
        bank.addCustomer("Aaron", "Li");
        System.out.println("bank number is:" + bank.getNumberOfCustomer());

    }
}
