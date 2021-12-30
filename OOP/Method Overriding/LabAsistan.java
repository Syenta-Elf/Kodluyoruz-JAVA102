import java.sql.Date;

public class LabAsistan extends Asistan {

    LabAsistan(String labAssistantName, String labAssistantPhone, String labAssistantEmail, String bolum, String unvan, Date ofisSaati) {
        super(labAssistantName, labAssistantPhone, labAssistantEmail, bolum, unvan, ofisSaati);
        //TODO Auto-generated constructor stub
    }

    public void lablaraGir()
    {
        System.out.println(this.getStaffName()+" lab'a giriş yaptı.");
    }
    
}
