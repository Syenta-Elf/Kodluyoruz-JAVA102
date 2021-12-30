public class GuvenlikGorevlisi extends Memur {
    private String belge;
    GuvenlikGorevlisi(String staffName, String staffPhone, String staffEmail, String departman, String mesai,String belge) {
        super(staffName, staffPhone, staffEmail, departman, mesai);
        this.belge = belge;
        //TODO Auto-generated constructor stub
    }
    public void nobet()
    {
        System.out.println(this.getStaffName()+" nobette.");
    }
    @Override
    public  void calis()
    {
        System.out.println("Güvenlik: "+this.getStaffName()+" calisiyor.");
    }
    @Override
    public void entry()
    {
        System.out.println("Güvenlik: "+this.getStaffName()+" giriş yaptı.");
    }
    
}
