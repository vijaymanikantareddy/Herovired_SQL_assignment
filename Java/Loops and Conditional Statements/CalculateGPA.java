package loops_conditional_stmts;

import java.util.Scanner;

public class CalculateGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Marks Obtained by a Student: ");
            int marks = sc.nextInt();
            System.out.print("Enter Total Marks: ");
            int totalMarks = sc.nextInt();
            double percentage = ((double) marks / totalMarks) * 100;
            if (percentage >= 90 && percentage <= 100) {
                System.out.printf("Percentage: %.2f\n", percentage);
                System.out.println("Grade A, GPA = 4.0");
            } else if (percentage >= 80 && percentage <= 89) {
                System.out.printf("Percentage: %.2f\n", percentage);
                System.out.println("Grade B, GPA = 3.0");
            } else if (percentage >= 70 && percentage <= 79) {
                System.out.printf("Percentage: %.2f\n", percentage);
                System.out.println("Grade C, GPA = 2.0");
            } else if (percentage >= 60 && percentage <= 69) {
                System.out.printf("Percentage: %.2f\n", percentage);
                System.out.println("Grade D, GPA = 1.0");
            } else {
                System.out.printf("Percentage: %.2f\n", percentage);
                System.out.println("Grade F, GPA = 0.0");
            }
        } catch (Exception e) {
            System.out.println("Enter Valid Integer!");
        }
        sc.close();
    }
}
