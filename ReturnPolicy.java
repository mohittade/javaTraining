import java.util.Scanner;

public class ReturnPolicy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        String defective = sc.next();
        String premium = sc.next();

        if (days <= 7
                || defective.equalsIgnoreCase("Yes")
                || (premium.equalsIgnoreCase("Yes") && days <= 15)) {
            System.out.println("Return Accepted");
        } else {
            System.out.println("Return Rejected");
        }
    }
}