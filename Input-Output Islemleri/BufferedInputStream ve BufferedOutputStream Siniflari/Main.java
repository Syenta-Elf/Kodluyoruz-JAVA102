import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        
        try {
            File createFile = new File("text.txt");
            try {
                createFile.createNewFile();
            } catch (IOException e) {
               
                e.printStackTrace();
            }
            FileInputStream file = new FileInputStream("text.txt");
            BufferedInputStream binput = new BufferedInputStream(file);

            int i = binput.read();

            while(i!=-1)
            {
                System.out.print((char)i);
                i = binput.read();
            }
            binput.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        try {
            String data = "\n demene tahtasi";
            FileOutputStream fileOutputStream = new FileOutputStream("new.txt");
            BufferedOutputStream bOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] dataByte = data.getBytes();
            bOutputStream.write(dataByte);
            bOutputStream.close();
            fileOutputStream.close();
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }
}