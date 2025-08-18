import java.util.Scanner;
import java.util.regex.*;
class EmailValidator {
    public static void validateEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@([a-zA-Z0-9.-]+)\\.(com|in|edu)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            String[] parts = email.split("@");
            System.out.println("Valid Email");
            System.out.println("Username: " + parts[0]);
            System.out.println("Domain: " + parts[1]);
        } else {
            System.out.println("Invalid Email");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an email address: ");
        String email = scanner.nextLine();
        validateEmail(email);
    }
}