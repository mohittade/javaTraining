import java.util.Scanner;

public class DynamicPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double basePrice = sc.nextDouble();
        String demand = sc.next();
        String weekend = sc.next();

        double finalPrice = basePrice;

        if (demand.equalsIgnoreCase("High")) {
            finalPrice += finalPrice * 0.20;
        }

        if (weekend.equalsIgnoreCase("Yes")) {
            finalPrice += finalPrice * 0.10;
        }

        System.out.println("Final Price = " + finalPrice);
    }
}