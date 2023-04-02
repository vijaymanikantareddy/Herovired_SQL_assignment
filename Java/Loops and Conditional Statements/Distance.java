package loops_conditional_stmts;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cont = 'y';
        while (cont != 'n') {
            System.out.println("Menu based app - Unit conversion for Distance");
            System.out.println("1. CM to M");
            System.out.println("2. M to KM");
            System.out.println("3. KM to M");
            System.out.println("4. M to CM");
            System.out.print("Enter your menu - ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Please enter the CM value: ");
                    int cm = sc.nextInt();
                    System.out.println(cm + " CM = " + ((float)cm / 100) + " M");
                    break;
                case 2:
                    System.out.print("Please enter the M value: ");
                    int m = sc.nextInt();
                    System.out.println(m + " M = " + ((float)m / 1000) + " KM");
                    break;
                case 3:
                    System.out.print("Please enter the KM value: ");
                    float km = sc.nextInt();
                    System.out.println(km + " KM = " + (km * 1000) + " M");
                    break;
                case 4:
                    System.out.print("Please enter the M value: ");
                    float meter = sc.nextInt();
                    System.out.println(meter + " M = " + (meter * 100) + " CM");
                    break;
                default:
                    System.out.println("Enter valid Option!");
                    cont = sc.next().charAt(0);
            }
            System.out.print("Do you want to Continue: ");
            cont = sc.next().charAt(0);
        }
        sc.close();
    }
}