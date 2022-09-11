package com.bridgelabz.BankAccount;

public class Account {
    private String AccountNumber;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNo;

    public Account(String accountNumber, double balance, String name, String email, String phoneNo) {
        AccountNumber = accountNumber;
        Balance = balance;
        Name = name;
        Email = email;
        PhoneNo = phoneNo;
    }

    public void DepositMoney(double DepositedMoney) {
        this.Balance += DepositedMoney;
        System.out.println("Deposit is sucessful\n"+"New balance is "+this.Balance);
    }
    public void Withdraw(double WithdrawMoney){
       if(this.Balance - WithdrawMoney < 0){
           System.out.println("Withdraw unsucessful\n"+"Insuffecent fund\n"+"Your Current balance is "+this.Balance);
       }
       else{
           this.Balance -= WithdrawMoney;
           System.out.println("Withdraw Sucessful\n"+"Your current balance is "+this.Balance);
       }
    }

    public String getAccountNumber() {
        System.out.println("Your Account number is "+this.AccountNumber);
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        System.out.println("Your current balance is "+this.Balance);
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountNumber='" + AccountNumber + '\'' +
                ", Balance='" + Balance + '\'' +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                '}';
    }
}
