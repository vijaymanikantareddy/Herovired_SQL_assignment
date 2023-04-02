package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array A size: ");
        int m = sc.nextInt();
        int a[] = new int[m];
        HashMap<Integer, Integer> mp = new HashMap<>();
        System.out.print("enter array A elements: ");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            if (mp.containsKey(a[i])) {
                mp.put(a[i], mp.get(a[i]) + 1);
            } else {
                mp.put(a[i], 1);
            }
        }
        System.out.print("enter array B size: ");
        int n = sc.nextInt();
        int b[] = new int[n];
        System.out.print("enter array B elements: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            if (mp.containsKey(b[i])) {
                cnt = mp.get(b[i]);
            }
            System.out.print("Frequency of " + b[i] + " is " + cnt);
        }
        sc.close();
    }
}
