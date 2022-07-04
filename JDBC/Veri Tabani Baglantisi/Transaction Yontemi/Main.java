import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main{
    public static void main(String[] args) {
        Connection c =null;
        try {
            Class.forName("org.postgresql.Driver");
            c= DriverManager.getConnection("jdbc:postgresql://localhost:5432/bookstore", "postgres", "Kawai.333");
            c.setAutoCommit(false);//Hafızaya alıyor, hata alınırsa veriler girilmiyor. Alınmazsa giriliyor.
            System.out.println("Başarılı");
            PreparedStatement   pStatement = c.prepareStatement("INSERT INTO author  (first_name,last_name,email) VALUES (?,?,?)");
            
            pStatement.setString(1, "Elif");
            pStatement.setString(2, "Telase");
            pStatement.setString(3, "free@gmail.com");
            pStatement.executeUpdate();

            if(true){
                throw new SQLException();
            }

            pStatement.setString(1, "A");
            pStatement.setString(2, "Y");
            pStatement.setString(3, "Z@gmail.com");
            pStatement.executeUpdate();
            c.commit();
            pStatement.close();
            c.close();
        } catch (Exception e) {
            if(c!=null)
            {
                try {
                    c.rollback();
                } catch (SQLException e1) {
                    System.out.println(e1.getMessage());
                }
            }
            System.out.println(e.getMessage());
        }
        
    }
}