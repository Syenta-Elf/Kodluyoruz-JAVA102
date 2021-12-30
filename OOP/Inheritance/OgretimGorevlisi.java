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
    @Override
    public void derseGir()
    {
        System.out.println("Ogretim gorevlisi: "+this.getStaffName()+" derse girer.");
    }
    @Override
    public void entry()
    {
        System.out.println("Öğretim görevlisi: "+this.getStaffName()+" giriş yaptı.");
    }
}
