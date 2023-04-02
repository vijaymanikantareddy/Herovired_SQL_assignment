package loops_conditional_stmts;

import java.util.Scanner;

class SwapIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        try {
            System.out.print("Enter numA: ");
            a = sc.nextInt();
            System.out.print("Enter numB: ");
            b = sc.nextInt();
            int temp = a;
            a = b;
            b = temp;
            System.out.println("numA = " + a);
            System.out.println("numB = " + b);
        } catch (Exception e) {
            System.out.println("Enter a valid integer!");
        }
        sc.close();
    }
}