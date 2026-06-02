import java.util.Scanner;

public class LoginLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "admin123";
        int attempts = 0;

        while (attempts < 3) {
            String input = sc.next();

            if (input.equals(password)) {
                System.out.println("Login Successful");
                return;
            }
            attempts++;
        }

        System.out.println("Account Locked");
    }
}