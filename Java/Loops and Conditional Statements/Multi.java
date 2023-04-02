package loops_conditional_stmts;

import java.util.Scanner;

public class Multi {
    public static void tablePrinting(int n) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            System.out.print("Enter a Number: ");
            n = sc.nextInt();
            tablePrinting(n);
        } catch (Exception e) {
            System.out.println("Enter a valid Integer!!!");
        }
        sc.close();
    }
}
