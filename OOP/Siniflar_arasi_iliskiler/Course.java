public class Course {
    private String courseCode;
    private String courseName;
    private Instructor instructor;
    
    Course(String courseName , String courseCode, Instructor instructor)
    {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }
    public Instructor getInstructor() {
        return instructor;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public static double calcAvg(Student[] students)
    {
        double avg = 0.0;
        for (Student student : students) {
               avg += student.getNote();
        }
        return avg/students.length;
    }
}
