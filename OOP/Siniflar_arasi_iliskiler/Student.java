public class Student {
    public static double size;
    private String name;
    private int number;
    private int note;
    private String studentClass;

    public Student(String name, int number, String studentClass,int note) {
        this.name = name;
        this.number = number;
        this.studentClass = studentClass;
        this.note = note;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getNote() {
        return note;
    }
    public void setNote(int note) {
        this.note = note;
    }
    
}
