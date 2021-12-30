/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("name1", 1, "4/A",40);
        Student s2 = new Student("name2", 10, "4/B",50);
        Student s3 = new Student("name3", 20, "4/C",60);

        Instructor t1 = new Instructor("t1", "t1.department");
        Course c1 = new Course("courseName", "courseCode", t1);
        
        Student[] students =  {s1,s2,s3};
        
        System.out.println(Course.calcAvg(students));
        System.out.println(c1.getInstructor().getName() + " " + c1.getInstructor().getDepartment());
        
    }
}