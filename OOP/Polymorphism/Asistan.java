import java.sql.Date;

public class Asistan extends Akademisyen {

    private Date ofisSaati;
    Asistan(String staffName, String staffPhone, String staffEmail, String bolum, String unvan,Date ofisSaati) {
        super(staffName, staffPhone, staffEmail, bolum, unvan);
        this.ofisSaati = ofisSaati;
        //TODO Auto-generated constructor stub
    }public void quizzYap()
    {
        System.out.println(this.getStaffName()+" quizz yapıyor.");
    }
}
