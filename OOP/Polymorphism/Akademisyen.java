
public class Akademisyen extends Staff{

    private String bolum;
    private String unvan;

    Akademisyen(String staffName, String staffPhone, String staffEmail,String bolum,String unvan) {
        super(staffName, staffPhone, staffEmail);
        this.bolum = bolum;
        this.unvan = unvan;
    }
    
    public void derseGir()
    {
        System.out.println(this.getStaffName()+" derse giriş yaptı.");
    }

    @Override
    public void entry()
    {
        System.out.println("Akademisyen:"+this.getStaffName()+" giriş yaptı.");
    }
        
}
