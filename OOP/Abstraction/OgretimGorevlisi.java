public class OgretimGorevlisi extends Akademisyen {

    private int kapiNo;
    OgretimGorevlisi(String staffName, String staffPhone, String staffEmail, String bolum, String unvan,int kapiNo) {
        super(staffName, staffPhone, staffEmail, bolum, unvan);
        this.kapiNo = kapiNo;
        //TODO Auto-generated constructor stub
    }

    public void senatoToplantisi()
    {
        System.out.println(this.getStaffName()+" senato toplantısında.");
    }
    
    public void sinavYap()
    {
        System.out.println(this.getStaffName()+" sinav yapiyor.");
    }
}
