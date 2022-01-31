import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        byte[] dizi = {1,2,5,8,12};

        ByteArrayInputStream input = new ByteArrayInputStream(dizi,0,4);
        int i = input.read();
        while(i!=-1)
        {
            System.out.print(i+" ");
            i = input.read();
        }
        try {
            input.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        String data = "Java 102 ogreniyorum.";

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            output.write(data.getBytes());
            String newData = output.toString();
            System.out.println("\nCikis akisi:"+newData);
        } catch (IOException e) {
         
            e.printStackTrace();
        }

    }
}