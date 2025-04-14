class Student {
    private String name;
    private int age;
    private String program;
    private String course;

    // Constructor to initialize all Student details
    public Student(String name, int age, String program, String course) {
        this.name = name;
        this.age = age;
        this.program = program;
        this.course = course;
    }

    // Default constructor
    public Student() {
        // Default constructor
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProgram() {
        return program;
    }

    public String getCourse() {
        return course;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Method to display student information
    public void displayStudentInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Program: " + program);
        System.out.println("Course: " + course);
    }
}