/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Akademisyen a1 = new Akademisyen("Gülnur", "222-222-222", "akademisyen@mail.com","Bilgisayar","Prof.");
        Staff s1 = new Staff("Berk", "staffPhone", "staffEmail");
        LabAsistan la1 = new LabAsistan("Merve", "labAssistantPhone", "labAssistantEmail", "bolum", "unvan", null );
        Staff[] staffs = {a1,s1,la1};

        Staff.caliasanGiris(staffs);
        
    }
}