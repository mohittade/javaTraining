import java.util.Scanner;

public class DiscountEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();
        String premium = sc.next();

        double discount = 0;

        if (amount >= 5000)
            discount = 20;
        else if (amount >= 3000)
            discount = 10;

        if (premium.equalsIgnoreCase("Yes"))
            discount += 5;

        double finalAmount = amount - (amount * discount / 100);

        System.out.println("Final Amount = " + finalAmount);
    }
}