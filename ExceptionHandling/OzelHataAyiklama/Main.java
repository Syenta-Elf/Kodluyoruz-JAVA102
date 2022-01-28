import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AgeCheckException {
        Scanner sc = new Scanner(System.in);
        
        
        try {
            int age = sc.nextInt();
            checkAge(age);
            
        } catch (InputMismatchException e) {
            System.out.println("Hatali veri girdiniz.");
        }finally
        {
            System.out.println("Program bitti.");
            sc.close();
        }
    }

    public static void checkAge(int age) throws AgeCheckException
    {
        if(age<18)
        {
            throw new AgeCheckException("Hatalı Yas");
        }
    }
       
}
