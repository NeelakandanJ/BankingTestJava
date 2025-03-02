package com.ecommerce;

 class SavingsAccount extends BankAccount{
     double interestRate = 4.5;
    public SavingsAccount(String accountHolder, double balance){
        super(accountHolder,balance);
    }
    public void withdraw(int amount) {
        if (amount > balance){
            System.out.println("Insufficient balance");
        }else {
            balance -=amount;
            System.out.println("Your requested amount "+amount +" debited successfully. Avail Balance is : "+balance);
        }
    }
    public void applyInterest(){
        double interest = (balance *interestRate) /100 ;
        balance += interest;
        System.out.println("Interest of "+interest +" applied. New balance is "+balance);
    }
}
