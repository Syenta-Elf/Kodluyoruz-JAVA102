import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        TreeSet<Student> students = new TreeSet<>(new OrderNoteComp());

        students.add(new Student("Damla",31));
        students.add(new Student("Zeynep",2));
        students.add(new Student("Elif",60));
        students.add(new Student("Berk",6));
        students.add(new Student("Ebur",19));
        
        
        for(Student stu : students)
        {
            System.out.print(stu.getName()+" ");
            System.out.println(stu.getNote());
        }

    }
}
