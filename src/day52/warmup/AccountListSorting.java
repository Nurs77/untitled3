package day52.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting  {
    public static void main(String[] args) {


        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("Jon Snow", 10000));
        accountList.add(new Account("Pidar", 15000));
        accountList.add(new Account("Nurs", 2000));
        accountList.add(new Account("Aibek", 10000));
        System.out.println("account before = \n" + accountList);
        Collections.sort(accountList);
        System.out.println("accountList after = \n" + accountList);

Account a1 = new Account("Nurs",3201);
Transferable b1 = new Account("Nurs2",1000);
Comparable c1 = new Account("Nurs2.5",9000);
Object o1 = new Account("Nurs3",8000);


    }
}