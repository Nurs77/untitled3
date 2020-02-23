package day46;

public class SavingAccount extends BankAccount {



    double interestRate;

    /**
     * A constructor to set all the fields value
     *
     * @param accountHolder
     * @param accountNum
     * @param balance
     * @param interestRate
     */

    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate){

        super(accountHolder, accountNum, balance);
        this.interestRate = interestRate;

    }

    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Mohammed", 12345, 50000,0.042);
        System.out.println("s1.toString() = " + s1.toString());

        s1.withdraw(1000);
        System.out.println("s1 = " + s1);
        s1.deposit(100);
        System.out.println("s1 = " + s1);

    }

    public void withdraw(int amount){
        //taking away 30 penalty on top
//      balance = balance- amount;
//        balance -=30;
        super.withdraw(amount);
        super.withdraw(30);
        
    }
    public void deposit(int amount){
int actualAmount = (int)(amount+amount*interestRate);
        super.deposit(actualAmount);
    }

    @Override // Once being used, it will enforce override rule
    //if any rule does not match it will not even compile
    // so it's always good to use it to prevent accidental errors
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
