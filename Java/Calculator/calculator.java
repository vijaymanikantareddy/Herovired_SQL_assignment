import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Console Based Calculator App***");
        char choice = 'y';
        while (choice == 'y') {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Mulitplication");
            System.out.println("4. Division");
            System.out.println("5. Percentage");
            System.out.println("6. Factorial");
            System.out.println("7. Square");
            System.out.println("8. Cube");
            System.out.println("9. Square root");
            System.out.println("10. a Power b");
            System.out.println("11. a Root b");
            int option = sc.nextInt();
            int op1, op2;
            switch (option) {
                case 1:
                    System.out.print("Enter two operands: ");
                    op1 = sc.nextInt();
                    op2 = sc.nextInt();
                    System.out.println("Addition of two numbers is: " + (op1 + op2));
                    break;
                case 2:
                    System.out.print("Enter two operands: ");
                    op1 = sc.nextInt();
                    op2 = sc.nextInt();
                    System.out.println("Subtraction of two numbers is: " + (op1 - op2));
                    break;
                case 3:
                    System.out.print("Enter two operands: ");
                    op1 = sc.nextInt();
                    op2 = sc.nextInt();
                    System.out.println("Multiplication of two numbers is: " + (op1 * op2));
                    break;
                case 4:
                    System.out.print("Enter two operands: ");
                    op1 = sc.nextInt();
                    op2 = sc.nextInt();
                    while (op2 == 0) {
                        System.out.println("Number division exception raises, enter a valid number: ");
                        op2 = sc.nextInt();
                    }
                    System.out.println("Division of two numbers is: " + (op1 / op2));
                    break;
                case 5:
                    System.out.print("Enter two operands: ");
                    op1 = sc.nextInt();
                    op2 = sc.nextInt();
                    float percentage = ((float) op1 / op2) * 100;
                    System.out.printf("The Percentage is: %.2f\n", percentage);
                    break;
                case 6:
                    Long fact = 1l;
                    System.out.print("Enter number: ");
                    op1 = sc.nextInt();
                    for (int i = 1; i <= op1; i++) {
                        fact *= (long) i;
                    }
                    System.out.println("The factorial is: " + fact);
                    break;
                case 7:
                    System.out.print("Enter number: ");
                    op1 = sc.nextInt();
                    System.out.println("Square of number is: " + (int) Math.pow(op1, 2));
                    break;
                case 8:
                    System.out.print("Enter number: ");
                    op1 = sc.nextInt();
                    System.out.println("Cube of number is: " + (int) Math.pow(op1, 3));
                    break;
                case 9:
                    System.out.print("Enter number: ");
                    op1 = sc.nextInt();
                    System.out.println("Square Root of number is: " + Math.pow(op1, 0.5));
                    break;
                case 10:
                    System.out.print("Enter two operands: ");
                    op1 = sc.nextInt();
                    op2 = sc.nextInt();
                    System.out.println("a Power b is: " + (int) Math.pow(op1, op2));
                    break;
                case 11:
                    System.out.print("Enter two operands: ");
                    op1 = sc.nextInt();
                    op2 = sc.nextInt();
                    System.out.println("a Root b is: " + Math.pow(op1, 1 / (float) op2));
                    break;
            }
            System.out.print("Do you want to continue (y/n): ");
            choice = sc.next().charAt(0);
        }
        System.out.println("Program exitted successfully");
        sc.close();
    }
}
