import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Discounted selling price? ");
        double discountedPrice = input.nextDouble();

        System.out.print("Discount percentage? ");
        double discountPercentage = input.nextDouble();

        double originalPrice = discountedPrice / (1 - discountPercentage / 100);

        System.out.println("Original selling price = " + originalPrice);

        input.close();
    }
}
