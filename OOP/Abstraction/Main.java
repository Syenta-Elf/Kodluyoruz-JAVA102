package OOP.Abstraction;


/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Akademisyen a1 = new Akademisyen("akademisyen", "222-222-222", "akademisyen@mail.com","Bilgisayar","Prof.");
        Staff s1 = new Staff("staffName", "staffPhone", "staffEmail");
        LabAsistan la1 = new LabAsistan("labAssistantName", "labAssistantPhone", "labAssistantEmail", "bolum", "unvan", null );
        
    }
}