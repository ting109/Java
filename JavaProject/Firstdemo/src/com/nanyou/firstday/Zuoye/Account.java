package com.nanyou.firstday.Zuoye;

public class Account {
    private int id;  //用户的账号
    private double balance;//账号余额
    private double annualInterestRate;//年利率
    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void withdraw(double amount){
        if(this.balance < amount){
            System.out.println("余额不足，取款失败");
            return;
        }
        this.balance -= amount;
        System.out.println("成功取出："+amount);


    }
    public void deposit(double amount){
        if(amount>0){
            this.balance += amount;
            System.out.println("成功存入："+amount);
        }
    }
}
