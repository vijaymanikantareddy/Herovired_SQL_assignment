package loops_conditional_stmts;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            System.out.print("Enter num: ");
            n = sc.nextInt();
            System.out.println();
            int iter = 1;
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= iter ; j++){
                    System.out.print("* ");
                }
                iter += 2;
                System.out.println();
            }
            iter -= 4;
            for(int i = n-1 ; i>=1 ; i--){
                for(int j = iter ; j >= 1 ; j--){
                    System.out.print("* ");
                }
                System.out.println();
                iter -= 2;
            }
        } catch (Exception e) {
            System.out.println("Enter Valid Integer!!!");
        }
        sc.close();
    }
}