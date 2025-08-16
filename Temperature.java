public class Temperature {

    // Method to convert Fahrenheit to Celsius
    public static double celsius(int fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        // Print the table header
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("---------------------------");
        System.out.println("---------------------------");

        // Loop through Fahrenheit values from 0 to 20
        for (int fahrenheit = 0; fahrenheit <= 20; fahrenheit++) {
            double celsiusValue = celsius(fahrenheit);
            // Print the Fahrenheit value and its Celsius equivalent
            System.out.printf("%d\t\t\t%.2f\n", fahrenheit, celsiusValue);
        }
    }
}
