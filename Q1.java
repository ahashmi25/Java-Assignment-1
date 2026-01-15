import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter obtained marks: ");
        double obtained = read.nextDouble();

        System.out.print("Enter maximum marks: ");
        double max = read.nextDouble();

        double percentage = (obtained / max) * 100;

        System.out.printf("Percentage marks = %.2f%%", percentage);

        read.close();
    }
}
