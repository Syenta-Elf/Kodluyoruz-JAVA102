package src;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

import src.account.Account;
import src.account.EnterpriseAccount;
import src.account.IndividualAccount;
import src.account.User;

public class CreateAccounts {
    public static TreeSet<Account> accounts = new TreeSet<>();

    public CreateAccounts(){
        User user1 = new User("name1","surname1","email1","password1","job1",10,null,LocalDate.now());
        User user2 = new User("name2","surname2","email2","password2","job2",12,null,LocalDate.now());
        User user3 = new User("name3","surname3","email3","password3","job3",13,null,LocalDate.now());
        User user4 = new User("name4","surname4","email4","password4","job4",40,null,LocalDate.now());

        Account account1 = new EnterpriseAccount(user1);
        Account account2 = new IndividualAccount(user2);
        Account account3 = new IndividualAccount(user3);
        Account account4 = new EnterpriseAccount(user4);

        Collections.addAll(accounts, account1,account2,account3,account4);
        for (Account account : accounts){
            System.out.println(account.getUser().getName());
        }   

    }
}
