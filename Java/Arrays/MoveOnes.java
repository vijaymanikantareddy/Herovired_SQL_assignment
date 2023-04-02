package arrays;

import java.util.Scanner;

public class MoveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0, a = 0;
        while (i < n) {
            if (arr[i] != 1) {
                arr[a++] = arr[i];
            }
            i++;
        }
        while (a < n) {
            arr[a++] = 1;
        }
        System.out.print("The array after moving 1s to end: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
