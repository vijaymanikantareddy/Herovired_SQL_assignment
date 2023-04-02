package loops_conditional_stmts;

import java.util.Scanner;

public class PrimeOrNot {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("num = ");
            int n = sc.nextInt();
            if (isPrime(n)) {
                System.out.println("The given number " + n + " is a Prime number");
            } else {
                System.out.println("The given number " + n + " is NOT a prime number");
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Enter valid integer!!!");
        }
    }
}
