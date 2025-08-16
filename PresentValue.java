import java.util.Scanner;

public class PresentValue {

    // Method to calculate the present value based on future value, interest rate, and years
    public static double presentValue(double futureValue, double annualInterestRate, int years) {
        return futureValue / Math.pow(1 + annualInterestRate, years);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input future value, annual interest rate, and number of years from the user
        System.out.print("What is the desired future value? ");
        double futureValue = scanner.nextDouble();

        System.out.print("What is the annual interest rate? ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("For how many years? ");
        int years = scanner.nextInt();

        // Calculate the present value
        double presentValue = presentValue(futureValue, annualInterestRate, years);

        // Display the result
        System.out.printf("You need to invest $%.2f\n", presentValue);

        scanner.close();
    }
}
