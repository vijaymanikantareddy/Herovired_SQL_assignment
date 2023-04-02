package loops_conditional_stmts;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        char ch = 'y';
        while (ch != 'n') {
            try {
                System.out.println("\nMenu based app - Even/Odd Checker");
                System.out.print("Please enter the number: ");
                n = sc.nextInt();
                System.out.print("The given number - ");
                System.out.println((n & 1) == 1 ? n + " is a ODD number" : n + " is an EVEN number");
                System.out.print("Do you want to Continue: ");
                ch = sc.next().charAt(0);
                if (ch == 'n' || ch != 'y') {
                    break;
                }
            } catch (Exception e) {
                System.out.println();
            }
        }
        sc.close();
    }
}
