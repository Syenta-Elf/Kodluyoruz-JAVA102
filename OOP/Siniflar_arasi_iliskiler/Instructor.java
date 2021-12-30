public class Instructor {
    private String name;
    private String department;

    Instructor(String name, String department)
    {
        this.setName(name);
        this.setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
