package com.ecommerce;

public class LoanAccount extends SavingsAccount{
    int eligibleLoanAmount = 15000;
    int loanAmount;
    public LoanAccount(String accountHolder, double balance,int loanAmount){
        super(accountHolder,balance);
        this.loanAmount =loanAmount;
    }
    public void takeLoan(int amount){
        if (eligibleLoanAmount < amount){
            System.out.println("you are not eligible for this amount "+amount+". Your max loan amount is "+eligibleLoanAmount);
        }else {
            loanAmount +=amount;
            balance += amount;
            System.out.println("Your loan amount "+amount+" credited to your account. New balance is "+balance);
        }
    }
    public  void lonRepay(int amount){
        if (amount> loanAmount){
            int bal = amount - loanAmount;
            balance += bal;
            System.out.println("Your loan amount "+loanAmount+" deposited successfully. balance amount "+bal+" deposited to your account. New balance is "+balance);
            loanAmount =0;
        }else {
            loanAmount -=amount;
            System.out.println("Your loan amount "+amount+" deposited successfully. Balance loan is "+loanAmount);
        }
    }
}
