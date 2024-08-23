
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StudentData studentGrades = new StudentData();
        
        while (true) {
            // Display the menu
            System.out.println("\nMenu:");
            System.out.println("1. Add Grade");
            System.out.println("2. View Statistics");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Grade
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    studentGrades.addGrade(grade);
                    System.out.println("Grade added.");
                    break;

                case 2:
                    // View Statistics
                    if (studentGrades.getGrades().isEmpty()) {
                        System.out.println("No grades available. Please add some grades first.");
                    } else {
                        GradeCalculator calculator = new GradeCalculator(studentGrades.getGrades());
                        double average = calculator.calculateAverage();
                        double highest = calculator.findHighest();
                        double lowest = calculator.findLowest();                            
                                           
                        
                        System.out.println("All the Grade:"+ calculator.AllGraders());
                        System.out.printf("Average Grade: %.2f%n", average);
                        System.out.printf("Highest Grade: %.2f%n", highest);
                        System.out.printf("Lowest Grade: %.2f%n", lowest);
                    }
                    break;

                case 3:
                    // Exit
                    System.out.println("Exiting the program.");
                    return;

                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }
    }
}
