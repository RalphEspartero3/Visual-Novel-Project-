import java.util.Scanner;

public class Studentsorting
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of Students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        String[] studentNumbers = new String[numStudents];
        String[] studentNames = new String[numStudents];
        int[] studentGrades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Student Number: ");
            studentNumbers[i] = scanner.nextLine();
            System.out.print("Student Name: ");
            studentNames[i] = scanner.nextLine();
            System.out.print("Student Grade: ");
            studentGrades[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

        boolean exit = false;
        while (!exit) {
            System.out.print("\nSort By [S] Student Number [G] Grade [V] View [E] Exit: ");
            String choice = scanner.nextLine().toUpperCase();
            switch (choice) {
                case "S":
                sortByStudentNumber(studentNumbers, studentNames, studentGrades);
                break;
                case "G":
                sortByGrade(studentNumbers, studentNames, studentGrades);
                break;
                case "V":
                viewStudents(studentNumbers, studentNames, studentGrades);
                break;
                case "E":
                exit = true;
                System.out.println("Process Completed.");
                    break;
                default:
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public static void sortByStudentNumber(String[] studentNumbers, String[] studentNames, int[] studentGrades) {
        for (int i = 0; i < studentNumbers.length - 1; i++) {
            for (int j = 0; j < studentNumbers.length - i - 1; j++) {
                if (studentNumbers[j].compareTo(studentNumbers[j + 1]) > 0) {
                    String tempNum = studentNumbers[j];
                    studentNumbers[j] = studentNumbers[j + 1];
                    studentNumbers[j + 1] = tempNum;

                    String tempName = studentNames[j];
                    studentNames[j] = studentNames[j + 1];
                    studentNames[j + 1] = tempName;

                    int tempGrade = studentGrades[j];
                    studentGrades[j] = studentGrades[j + 1];
                    studentGrades[j + 1] = tempGrade;
                }
            }
        }
        viewStudents(studentNumbers, studentNames, studentGrades);
    }

    public static void sortByGrade(String[] studentNumbers, String[] studentNames, int[] studentGrades) {
        for (int i = 0; i < studentGrades.length - 1; i++) {
            for (int j = 0; j < studentGrades.length - i - 1; j++) {
                if (studentGrades[j] > studentGrades[j + 1]) {
                    String tempNum = studentNumbers[j];
                    studentNumbers[j] = studentNumbers[j + 1];
                    studentNumbers[j + 1] = tempNum;

                    String tempName = studentNames[j];
                    studentNames[j] = studentNames[j + 1];
                    studentNames[j + 1] = tempName;

                    int tempGrade = studentGrades[j];
                    studentGrades[j] = studentGrades[j + 1];
                    studentGrades[j + 1] = tempGrade;
                }
            }
        }
        viewStudents(studentNumbers, studentNames, studentGrades);
    }

    public static void viewStudents(String[] studentNumbers, String[] studentNames, int[] studentGrades) {
        System.out.println("Viewing Students:");
        for (int i = 0; i < studentNumbers.length; i++) {
            System.out.println(studentNumbers[i] + " " + studentNames[i] + " " + studentGrades[i]);
        }
    }
}

    

