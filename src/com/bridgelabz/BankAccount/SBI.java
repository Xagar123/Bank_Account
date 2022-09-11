package com.bridgelabz.BankAccount;

public class SBI {
    public static void main(String[] args) {
        Account Customer1 = new Account("20307735949",1000,"Rahul","Rahul123@gmail.com","7654985674");

        Customer1.DepositMoney(500);
        Customer1.Withdraw(1000);

        Customer1.getAccountNumber();
        Customer1.getBalance();

    }
}
