package src;
import java.util.Scanner;
import java.util.TreeSet;

import src.account.Account;
import src.account.AuthenticationStatus;
import src.account.User;



public class Main {
    CreateAccounts createAccounts = new CreateAccounts();
    static TreeSet<Account> accounts = CreateAccounts.accounts;
    public static void main(String[] args) throws Exception {

        boolean bool = false ;
        User user = null;

        Scanner sc = new Scanner(System.in);

        String email = sc.nextLine();
        String password = sc.nextLine();



        for (Account a : accounts) {
            if(a.getUser().getEmail().equals(email)){
                bool = true;
                user = a.getUser();
                break;
            }
        }

        if(!bool){
            throw new Exception("Böyle bir mailde hesap yok");
        }

        AuthenticationStatus status = AuthenticationStatus.login(user, email, password);
        
        switch (status) {
            case SUCCESS:
                System.out.println("Başarılı");
                break;
            case FAIL:
                throw new Exception();
            default:
                break;
        }

    }

    public void login(){

    }
}
