import java.util.Scanner;

public class Conversion {

    // Method to convert and show distance in kilometers
    public static void showKilometers(double meters) {
        double kilometers = meters * 0.001;
        System.out.printf("%.2f meters is %.2f kilometers.\n", meters, kilometers);
    }

    // Method to convert and show distance in inches
    public static void showInches(double meters) {
        double inches = meters * 39.37;
        System.out.printf("%.2f meters is %.2f inches.\n", meters, inches);
    }

    // Method to convert and show distance in feet
    public static void showFeet(double meters) {
        double feet = meters * 3.281;
        System.out.printf("%.2f meters is %.2f feet.\n", meters, feet);
    }

    // Method to display the menu
    public static void menu() {
        System.out.println("\n1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters;
        int choice;

        // Ask for the distance in meters, ensuring a non-negative input
        do {
            System.out.print("Enter a distance in meters: ");
            meters = scanner.nextDouble();
            if (meters < 0) {
                System.out.println("Distance cannot be negative. Please enter a valid distance.");
            }
        } while (meters < 0);

        // Continue showing the menu until the user chooses to quit
        do {
            menu(); // Display the menu
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showKilometers(meters);
                    break;
                case 2:
                    showInches(meters);
                    break;
                case 3:
                    showFeet(meters);
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Error: Invalid choice. Please select 1, 2, 3, or 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
