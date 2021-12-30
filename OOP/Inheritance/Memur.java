public abstract class Memur extends Staff {

    private String departman;
    private String mesai;
    Memur(String staffName, String staffPhone, String staffEmail,String departman,String mesai) {
        super(staffName, staffPhone, staffEmail);
        this.departman=departman;
        this.mesai=mesai;
        //TODO Auto-generated constructor stub
    }

    public abstract void calis();
    
}
