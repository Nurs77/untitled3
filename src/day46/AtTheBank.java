package day46;

public class AtTheBank {
    public static void main(String[] args) {
        CheckingAccount account1 = new CheckingAccount("Nursultan",727272,30000);
        System.out.println("account1 original = \n" + account1);
        //depositing money plus 200
        account1.deposit(4000);
        System.out.println();
        System.out.println("account1 after adding 4000 + 200 = \n" + account1);
        //withdrawing money
        account1.withdraw(4200);
        System.out.println();
        System.out.println("account1 after withdrawing 4200 = \n" + account1);
    }
}
