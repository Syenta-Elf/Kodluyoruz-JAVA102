
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{
    public static void main(String[] args) {
        DateFormat dateFormatYMD = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        java.sql.Date sqlDate = new java.sql.Date(now.getTime());
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection c  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental", "postgres", "Kawai.333");
            Statement st =  c.createStatement();
            String insertSql = "INSERT INTO actor (first_name,last_name,last_update) VALUES ('Damla','Akar','2013-05-26 14:47:57.62')";
            String prSql = "INSERT INTO actor (first_name,last_name,last_update) VALUES (?,?,?)";
            // System.out.println(st.executeUpdate(insertSql));
            PreparedStatement pStatement = c.prepareStatement(prSql);
            pStatement.setString(1, "Ahmet");
            pStatement.setString(2, "Demir");
            pStatement.setDate(3, sqlDate);
            pStatement.executeUpdate();
            pStatement.close();
            
            //ResultSet data = st.executeQuery("SELECT * FROM actor");
            // while(data.next())
            // {
            //     System.out.println(data.getInt("actor_id")+" "+data.getString("first_name")+" - "+data.getString("last_name"));
            // }
            System.out.println("Başarılı");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}