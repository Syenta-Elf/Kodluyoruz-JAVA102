public class BilgiIslem extends Memur {

    private String gorev;
    BilgiIslem(String staffName, String staffPhone, String staffEmail, String departman, String mesai,String gorev) {
        super(staffName, staffPhone, staffEmail, departman, mesai);
        this.gorev = gorev;
        //TODO Auto-generated constructor stub
    }
    public void networkKurulum()
    {
        System.err.println(this.getStaffName()+" network kuruyor.");
    }
    @Override
    public  void calis()
    {
        System.out.println("Bilgi işlem: "+this.getStaffName()+" calisiyor.");
    }
    @Override
    public void entry()
    {
        System.out.println("Bilgi İşlem: "+this.getStaffName()+" giriş yaptı.");
    }
}
