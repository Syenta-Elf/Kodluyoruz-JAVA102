import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı girin :");
        int a = sc.nextInt();
        int b = 10; 
        System.out.println(b/a); // unchecked exceptioı 
        sc.close();
    }
}
