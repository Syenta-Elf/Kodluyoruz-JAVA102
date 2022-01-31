import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("patika.txt");
            while(input.read() != -1)
            {
                System.out.print((char) input.read());
            }
            
            // int i = input.read();
            // while(i != -1)
            // {
            //     System.out.print((char) i);

            //     i = input.read();
            // }
            // input.close();
        } catch (IOException e) {
            
            System.out.println(e.getMessage());
        }
        
    }
}