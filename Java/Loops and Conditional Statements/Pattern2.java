package loops_conditional_stmts;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            for (int i = n; i >= 1; i--) {
                for (int j = i; j >= 1; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 2; i <= n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Enter a valid number");
        }
        sc.close();
    }
}