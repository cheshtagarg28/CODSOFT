import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Convert INR to: USD, EUR, JPY");
        System.out.print("Enter target currency: ");
        String target = input.next().toUpperCase();

        System.out.print("Enter amount in INR: ");
        double inr = input.nextDouble();

        double result = 0;

        if (target.equals("USD")) {
            result = inr / 83.45;
        } else if (target.equals("EUR")) {
            result = inr / 91.34;
        } else if (target.equals("JPY")) {
            result = inr / 0.53;
        } else {
            System.out.println("Invalid currency.");
            return;
        }

        System.out.printf("Converted amount: %.2f %s\n", result, target);
        input.close();
    }
}

