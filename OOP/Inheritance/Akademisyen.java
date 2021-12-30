
public abstract class Akademisyen extends Staff{

    private String bolum;
    private String unvan;

    Akademisyen(String staffName, String staffPhone, String staffEmail,String bolum,String unvan) {
        super(staffName, staffPhone, staffEmail);
        this.bolum = bolum;
        this.unvan = unvan;
    }
    
    public abstract void derseGir();
     
}
