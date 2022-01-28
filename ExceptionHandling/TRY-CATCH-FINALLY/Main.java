import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 10;

        try {
            int a = sc.nextInt();
            sc.close();
            System.out.println(b / a);
            System.out.println("Bölme işlemi bitti.");
            
        } catch (ArithmeticException e) {
            System.out.println("İşlem Hatalı");
            System.out.println(e.toString());
        } catch(InputMismatchException e)
        {
            System.out.println("Yanlış türde veri girdiniz.");
            System.out.println(e.toString());
        } 
        finally {
            System.out.println("Koşulsuz Çalışıyor.");
            System.out.println("Program bitti.");
        }
    }
}