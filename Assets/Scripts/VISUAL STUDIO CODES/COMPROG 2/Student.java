public class Student {
    private String name;
    private String program;
    private String course;


    public Student() {
    }
    public Student(String name,String program, String course) {
        this.name = name;
        this.program = program;
        this.course = course;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public String getCourse() {
        return course;
    }
    public void displayStudentInformation() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Course: " + course);
    }
}
