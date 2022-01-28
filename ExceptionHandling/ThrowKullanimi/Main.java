import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        try {
            int age = sc.nextInt();
            checkAge(age);
            
        } catch (InputMismatchException e) {
            System.out.println("Hatali veri girdiniz.");
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }finally
        {
            System.out.println("Program bitti.");
            sc.close();
        }
    }

    public static void checkAge(int age) throws Exception
    {
        if(age<18)
        {
            throw new Exception("Yasiniz Tutmuyor.");
        }
    }
}
