package loops_conditional_stmts;

import java.util.Scanner;

public class ThreeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numA: ");
            int numA = sc.nextInt();
            System.out.print("Enter numB: ");
            int numB = sc.nextInt();
            System.out.print("Enter numC: ");
            int numC = sc.nextInt();
            double average = (numA + numB + numC) / 3;
            int minimumNumber = numA < numB ? (numA < numC ? numA : numC) : (numB < numC ? numB : numC);
            int maximumNumber = numA > numB ? (numA > numC ? numA : numC) : (numB > numC ? numB : numC);
            System.out.println("The Smallest Number: " + minimumNumber);
            System.out.println("The Largest Number: " + maximumNumber);
            System.out.println("Average of all three numbers: " + average);
            sc.close();
        } catch (Exception e) {
            System.out.println("Enter valid Integer!!!");
        }
    }
}
