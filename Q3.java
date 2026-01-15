import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Original selling price? ");
        double originalPrice = input.nextDouble();

        System.out.print("Discount percentage? ");
        double discountPercentage = input.nextDouble();

        double discountedPrice = originalPrice - (originalPrice * discountPercentage / 100);

        System.out.println("Discounted selling price = " + discountedPrice);

        input.close();
    }
}

