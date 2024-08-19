import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Close the scanner as we don't need any more input
        scanner.close();

        // Handle cases where the number is less than 2
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
        } else {
            boolean isPrime = true;

            // Check if n is divisible by any number other than 1 and itself
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Output the result
            if (isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }
}
