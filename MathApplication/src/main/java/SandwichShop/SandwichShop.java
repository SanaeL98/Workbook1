import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose sandwidch size:");
        System.out.println("1: Regular - $5.45");
        System.out.println("2: Large   - $8.95");
        System.out.print("Enter 1 or 2:");
        int size = input.nextInt();

        double price = 0.0;

        if (size == 1) {
            price = 5.45;
        } else if (size == 2) {
            price = 8.95;
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age <= 17) {
            price *= 0.90;
        } else if (age >= 65) {
            price *= 0.80;
        }

        System.out.print("$" + Math.round(price * 100.0) / 100.0);

        input.close();

    }
}
