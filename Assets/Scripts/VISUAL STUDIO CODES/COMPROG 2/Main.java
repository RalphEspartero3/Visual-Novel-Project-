import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] students = new String[5];
        int[] grades = new int[5];
        

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline
        }
        
    
                System.out.println("\nArray Elements");
                for (int i = 0; i < 5; i++) {
                    System.out.println(students[i] + " " + grades[i]);
        }
        
                            double sum = 0;
                            for (int grade : grades) {
                                sum += grade;
                            }
                            double average = sum / 5.0;
                            
                            System.out.println("\nAverage is: " + average);
                            
                            scanner.close();
    }
}
