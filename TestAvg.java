import java.util.Scanner;

public class TestAvg {

    // Method to calculate the average of five test scores
    public static double calcAverage(double score1, double score2, double score3, double score4, double score5) {
        return (score1 + score2 + score3 + score4 + score5) / 5;
    }

    // Method to determine the letter grade based on the score
    public static char determineGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the five test scores
        double[] scores = new double[5];

        // Input five test scores from the user with specific prompts
        System.out.print("Enter the first test score: ");
        scores[0] = scanner.nextDouble();

        System.out.print("Enter the second test score: ");
        scores[1] = scanner.nextDouble();

        System.out.print("Enter the third test score: ");
        scores[2] = scanner.nextDouble();

        System.out.print("Enter the fourth test score: ");
        scores[3] = scanner.nextDouble();

        System.out.print("Enter the fifth test score: ");
        scores[4] = scanner.nextDouble();

        // Display the letter grade for each score
        System.out.println("\nHere are the grades and the average:");
        for (int i = 0; i < 5; i++) {
            char grade = determineGrade(scores[i]);
            System.out.printf("Test %d: %c\n", i + 1, grade);
        }

        // Calculate and display the average score
        double average = calcAverage(scores[0], scores[1], scores[2], scores[3], scores[4]);
        System.out.printf("Average score: %.2f\n", average);
        System.out.println("Average Letter Grade: " + determineGrade(average));

        scanner.close();
    }
}
