import java.sql.Connection;
import java.sql.DriverManager;

public class Main{
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection c  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental", "postgres", "Kawai.333");
            System.out.println("Başarılı");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}