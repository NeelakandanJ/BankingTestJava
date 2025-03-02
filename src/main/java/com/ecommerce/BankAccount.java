package com.ecommerce;

abstract class BankAccount {
    private final String accountHolder;
     double balance;
    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(int amount){
        balance +=amount;
        System.out.println(accountHolder+" : Your amount "+amount +" is successfully deposited. New balance is: "+balance);
    }
    public abstract  void withdraw(int amount);
    public  void  displayBalance(){
        System.out.println(accountHolder +" : Your Balance is ₹"+balance);
    }
}
