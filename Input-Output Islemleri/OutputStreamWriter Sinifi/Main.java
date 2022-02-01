import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        String data = "\nitem item item";
        try (FileOutputStream file = new FileOutputStream("Text.txt", true)) {
            OutputStreamWriter output = new OutputStreamWriter(file, Charset.forName("UTF8"));
            output.write(data);
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
