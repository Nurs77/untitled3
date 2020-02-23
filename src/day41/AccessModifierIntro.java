package day41;
import day40.BankAccount;
public class AccessModifierIntro {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        //What is defaul taccess modifier?
        //If there is no access modifier
        //in front of method or field
        //it means it has default access modifier
        //This will make the method of the field
        //only accessible within the same package
        b1.showAccountBalance();

        //the BankAccount instance field from day40
        //does not have any access modifier
        // so it means it has default access modifier
        b1.balance = 1000;

    }
}
