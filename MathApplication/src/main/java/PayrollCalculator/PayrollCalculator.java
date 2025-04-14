package PayrollCalculator;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine ();

        System.out.println("Enter hours worked: ");
        int hours = input.nextInt();

        System.out.println("Enter your pay rate: ");
        int PayRate = input.nextInt();

        double GrossPay = hours * PayRate;
        System.out.println("Employee Name:" + name);
        System.out.println("Gross Pay: $" + GrossPay);

        input.close();




    }
}
