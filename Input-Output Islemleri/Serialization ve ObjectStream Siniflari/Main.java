import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("audi","a3");
        try {
            FileOutputStream fileOutput = new FileOutputStream("text.txt");
            ObjectOutputStream output = new ObjectOutputStream(fileOutput);
            output.writeObject(c1);
            output.writeObject(new Car("audi","a5"));
            output.close();
            fileOutput.close();

            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            FileInputStream fileInput = new FileInputStream("text.txt");
            ObjectInputStream object = new ObjectInputStream(fileInput);
            Car newCar = (Car) object.readObject();
            Car newCar2 = (Car) object.readObject();
            System.out.println(newCar.getModel()+" "+newCar.getBrand());
            System.out.println(newCar2.getModel()+" "+newCar2.getBrand());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
