import java.util.Scanner;

public class FraudDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();
        String locationMatch = sc.next();
        int transactions = sc.nextInt();

        if ((amount > 50000 && locationMatch.equalsIgnoreCase("No"))
                || transactions > 3) {
            System.out.println("Fraud Detected");
        } else {
            System.out.println("Transaction Safe");
        }
    }
}