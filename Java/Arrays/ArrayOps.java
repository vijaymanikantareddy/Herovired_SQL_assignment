package arrays;

import java.util.Scanner;

public class ArrayOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: ");
        int mi = Integer.MAX_VALUE, ma = Integer.MIN_VALUE;
        double ave = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            mi = mi < arr[i] ? mi : arr[i];
            ma = ma > arr[i] ? ma : arr[i];
            ave += arr[i];
        }
        System.out.println("The element with the Minimum value: " + mi);
        System.out.println("The element with the Maximum value: " + ma);
        System.out.println("Average of all array elements: " + (ave) / n);
        System.out.println("Total number of array elements: " + n);

    }
}
