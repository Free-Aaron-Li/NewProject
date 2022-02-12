package experience.experiment.exer2;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 10 - 下午4:45
 * @project: untitled1
 * @version: JDK17.0.2
 */

/**
 * @ClassName BankAccount
 * @Description exer1加强版
 * @Author Aaron-Li
 * @Date 2022 - 02 - 10 - 下午4:45
 * @Version JDK17
 */
public class BankAccount {
    private double balance;

    public BankAccount() {

    }

    public BankAccount(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * @Description 存钱操作
     */
    public void deposit(double amt) {//存钱
        if (amt > 0) {
            System.out.println("存入：" + amt + "元");
            balance += amt;
        }
    }

    /**
     * @Description 取钱操作
     */
    public void withdraw(double amt) {
        if (balance >= amt) {
            System.out.println("取出：" + amt + "元");
            balance -= amt;
        } else {
            System.out.println("取钱失败，余额不足！");
        }
    }
}
