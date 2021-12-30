public class Staff {
    private String staffName;
    private String staffPhone;
    private String staffEmail;

    Staff(String staffName,String staffPhone, String staffEmail)
    {
        this.staffName = staffName;
        this.staffPhone = staffPhone;
        this.staffEmail = staffEmail;
    }
    public void entry()
    {
        System.out.println("Çalışan:"+this.staffName+" giriş yaptı.");
    }
    public void exit()
    {
        System.out.println(this.staffName + "çıkış yaptı.");
    }
    public void refectory()
    {
        System.out.println(this.staffName + "yemekhaneye girdi.");
    }
    public String getStaffName() {
        return staffName;
    }
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    public String getStaffPhone() {
        return staffPhone;
    }
    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }
    public String getStaffEmail() {
        return staffEmail;
    }
    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }
    public static void caliasanGiris(Staff[] staffs)
    {
        for (Staff staff : staffs) {
                staff.entry();
        }
    }
}
