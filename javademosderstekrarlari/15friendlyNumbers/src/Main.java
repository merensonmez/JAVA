import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int friendlyNumber = in.nextInt();
        boolean result = isFriendly(friendlyNumber);
        if (result) {
            System.out.println("The integer is friendly");
        } else {
            System.out.println("The integer is not friendly");
        }
    }

    public static boolean isFriendly(int number) {
        int sumOfDigits = 0;
        int originalNumber = number;

        // Calculate sum of digits
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }

        // Check if sum of digits is a divisor of original number
        if (originalNumber % sumOfDigits == 0) {
            return true;
        } else {
            return false;
        }
    }
}