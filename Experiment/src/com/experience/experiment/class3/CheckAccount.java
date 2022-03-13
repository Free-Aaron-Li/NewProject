package com.experience.experiment.class3;
/*
 * @author: Aaron.Li
 * @date: 2022 - 02 - 26 - 下午5:26
 * @project: newJavaProject
 * @version: JDK17.0.2
 */

/**
 * @ClassName CheckAccount
 * @Description
 * @Author Aaron-Li
 * @Date 2022 - 02 - 26 - 下午5:26
 * @Version
 */
public class CheckAccount extends Account{
   public double overdraft;
   public CheckAccount(int id,double balance,double annualInterestRate,double overdraft){
       super(id,balance,annualInterestRate);
       this.overdraft=overdraft;
   }
    public void withdraw(double amount) {
        if(amount<getBalance()){
            setBalance(getBalance()-amount);
            System.out.println("您的账户余额："+getBalance());
            System.out.println("您的可透支额："+overdraft+"\n");
        }else{//余额透支
            if(amount-getBalance()<=overdraft){
                overdraft=overdraft-(amount-getBalance());
                setBalance(0);
                System.out.println("您的账户余额："+getBalance());
                System.out.println("您的可透支额："+overdraft+"\n");
            }else{
                System.out.println("超过可透支额！"+"\n");
                System.out.println("您的账户余额：0.0");
                System.out.println("您的可透支额："+overdraft+"\n");
            }
        }
    }
}
