import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your password:");
        String password = scanner.nextLine();

        int length = password.length();
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else {
                hasSpecialChar = true;
            }
        }

        int strengthScore = 0;

        if (length >= 8) {
            strengthScore++;
        }

        if (hasUpperCase) {
            strengthScore++;
        }

        if (hasLowerCase) {
            strengthScore++;
        }

        if (hasNumber) {
            strengthScore++;
        }

        if (hasSpecialChar) {
            strengthScore++;
        }

        String feedback;

        if (strengthScore == 5) {
            feedback = "Strong password. Well done!";
        } else if (strengthScore >= 3) {
            feedback = "Medium strength password. Consider adding more complexity.";
        } else {
            feedback = "Weak password. Please make it stronger.";
        }

        System.out.println("Password Strength: " + feedback);

        scanner.close();
    }
}
