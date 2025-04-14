package BasicCalculator;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();


        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");


        System.out.print("Please select an option: ");
        String choice = input.next();

        // Only multiply for now
        if (choice.equalsIgnoreCase("M")) {
            double result = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + result);
        } else {
            System.out.println("Only 'M' for multiply is allowed right now.");
        }

        input.close();

    }
}
