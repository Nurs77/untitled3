package day46;

public class BankAccount {
    String accountHolder;
    long accountNum;
    double balance;

  public BankAccount(){

  }
    public BankAccount(String accountHolder, long accountNum, double balance){
        this.accountHolder = accountHolder;
        this.accountNum =accountNum;
        this.balance=balance;

    }
    public void deposit(int amount){
        balance += amount;

    }
    public void withdraw(int amount){
        balance -= amount;

    }

}
