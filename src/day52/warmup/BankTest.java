package day52.warmup;

public class BankTest {
    public static void main(String[] args) {
        Account a1 = new Account("Jon Snow", 10000);
        Account a2 = new Account("Nursultan" , 20000);
        System.out.println("a1 before = " + a1);
        System.out.println("a2 before = " + a2);
        a1.transferAll(a2);
        System.out.println("a1 after transfer= " + a1);
        System.out.println("a2 after transfer= " + a2);
        a2.transferAll(a1);
        System.out.println("a1 re-transfering = " + a1);
        System.out.println("a2 re-transfering back= " + a2);
        System.out.println("Does a1 has a palindrome name? "+ a1.isPalindrome());
        System.out.println("Does a2 has a palindrome name? "+ a2.isPalindrome());
    }
}
