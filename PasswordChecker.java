import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        boolean digit = false;
        boolean upper = false;
        boolean special = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch))
                digit = true;
            else if (Character.isUpperCase(ch))
                upper = true;
            else if (!Character.isLetterOrDigit(ch))
                special = true;
        }

        if (password.length() >= 8 && digit && upper && special) {
            System.out.println("Strong Password");
        }
        else {
            System.out.print("Weak Password: ");

            if (password.length() < 8)
                System.out.print("length < 8 ");

            if (!digit)
                System.out.print("missing digit ");

            if (!upper)
                System.out.print("missing uppercase ");

            if (!special)
                System.out.print("missing special character ");
        }
    }
}