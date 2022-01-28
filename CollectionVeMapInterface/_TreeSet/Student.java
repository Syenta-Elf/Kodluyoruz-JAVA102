public class Student {
    private String name;
    private int note;
    
    public Student(String name, int note)
    {
        setName(name);
        setNote(note);
    }
    public int getNote() {
        return note;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNote(int note) {
        this.note = note;
    }
}
