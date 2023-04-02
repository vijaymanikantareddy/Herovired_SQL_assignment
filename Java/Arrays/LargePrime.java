package arrays;

import java.util.Scanner;

public class LargePrime {
    public static boolean isprime(int n) {
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
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (isprime(arr[i])) {
                res = res < arr[i] ? arr[i] : res;
                flag = true;
            }
        }
        if (flag) {
            System.out.println("The Largest Prime Number in the given array: " + res);
        } else {
            System.out.println("No prime number found in the array");
        }
        sc.close();
    }
}
