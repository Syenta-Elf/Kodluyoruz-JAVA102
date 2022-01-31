import java.io.File;

public class Main {
    public static void main(String[] args) {
        File dizin = new File("text/text2");
        dizin.mkdirs();
        String[] liste = dizin.list();

        for (String string : liste) {
                System.out.println(string);
        }

        File file = new File("text/text2/text.txt");
        try
        {
            boolean value = file.createNewFile(); // dosya oluşturacak ve geriye bir boolean değer döndürecek. Dosya zaten mevcutsa false dönecek.
            if(value)
            {
                System.out.println(file.getName()+"Dosya oluşturuldu.");
            }
            else
            {
                System.out.println("Dosya zaten mevcut.");
            }
        }catch(Exception e)
        {
            e.getStackTrace();
        }
        
        // System.out.println(file.getName()+" silindi.");
        // file.delete();
    }
}