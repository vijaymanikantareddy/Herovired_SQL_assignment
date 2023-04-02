package loops_conditional_stmts;

import java.util.Scanner;

public class SubStrPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("string Name: ");
        String input = sc.nextLine();
        System.out.print("Starting Index: ");
        int start = sc.nextInt();
        System.out.print("Ending Index: ");
        int end = sc.nextInt();
        if(start < 0 || end >= input.length()){
            System.out.println("Invalid Index");
        }else{
            String res = "";
            for(int i = start ; i <= end ; i++){
                res += input.charAt(i);
            }
            System.out.println("subString of Dinosaur from "+start+" to "+end+" is "+res);
        }
        sc.close();
    }
}
