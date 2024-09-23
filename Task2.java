import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSubjects = input.nextInt();

        double totalMarks = 0;
        double maxMarks = 100 * numSubjects;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter marks for subject " + i + ":");
            double marks = input.nextDouble();
            totalMarks += marks;
        }

        double percentage = (totalMarks / maxMarks) * 100;

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}
