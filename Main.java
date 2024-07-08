import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Finding the smallest number among three numbers
        System.out.print("Input the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int number3 = scanner.nextInt();

        double smallest = findSmallest(number1, number2, number3);
        System.out.println("The smallest value is " + smallest);

        // Checking if a number is negative, positive, or zero
        System.out.print("Input a number to check if it's positive, negative, or zero: ");
        int numberToCheck = scanner.nextInt();
        checkNumber(numberToCheck);

        // Checking if a string is a valid password
        System.out.println("A password must have at least ten characters.");
        System.out.println("A password consists of only letters and digits.");
        System.out.println("A password must contain at least two digits.");
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = scanner.next();

        if (isValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is invalid: " + password);
        }

        scanner.close();
    }

    public static double findSmallest(int num1, int num2, int num3) {
        int min = num1;

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }
    }

    public static boolean isValidPassword(String password) {
        // Password must have at least ten characters
        if (password.length() < 10) {
            System.out.println("A password must have at least ten characters.");
            return false;
        }

        // Password consists of only letters and digits
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                System.out.println("A password must consist of only letters and digits.");
                return false;
            }
        }

        // Password must contain at least two digits
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            System.out.println("A password must contain at least two digits.");
            return false;
        }

        return true;
    }
}
