package com.ecommerce;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BankSystem {
    public static void main(String[] args) {
       SavingsAccount ba =  new SavingsAccount("Neels",5000) ;
       ba.deposit(250);
       ba.withdraw(250);
       ba.displayBalance();
        System.out.println("==============================");
    CurrentAccount ca = new CurrentAccount("Arun",4000);
    ca.withdraw(500);
    ca.withdraw(10000);
    ca.displayBalance();

        System.out.println("-------------------");
        LoanAccount la = new LoanAccount("Kiran",4300,0);
        la.displayBalance();
        la.takeLoan(5000);
        la.displayBalance();
        la.lonRepay(3000);
        la.lonRepay(10000);


    }
}