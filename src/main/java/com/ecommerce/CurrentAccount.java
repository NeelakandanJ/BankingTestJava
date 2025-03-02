package com.ecommerce;

public class CurrentAccount extends BankAccount {
//   public CurrentAccount(String account)
    int excessLimit = 5000;

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public void withdraw(int amount){
        if (amount > balance+excessLimit){
            System.out.println("Insufficient balance or exceed your limit. Avail balance : "+balance);
        }else {
            balance-=amount;
            System.out.println("Your requested amount "+amount+" debited Successfully. Avail balance : "+balance);
        }
    }
}
