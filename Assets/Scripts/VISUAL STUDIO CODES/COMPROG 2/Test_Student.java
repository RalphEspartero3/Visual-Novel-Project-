public class Test_Student {
    public static void main(String[] args) {
        Student student1 = new Student("Cede James", "Infoman","Computer Science");

       
        Student student2 = new Student();
        student2.setName("PAUL JAK THE GREAT");
        student2.setProgram("RIZZ");
        student2.setCourse("Computer Engineering");

        Student student3 = new Student("Kim Dahyun",
         "Application Development", "Computer Programming 2");
        
        System.out.println("Student1 Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Program: " + student1.getProgram());
        System.out.println("Course: " + student1.getCourse());

        System.out.println("\nStudent2 Details:");
        student2.displayStudentInformation();

        System.out.println("\nStudent3 Details:");
        student3.displayStudentInformation();
    }
}
