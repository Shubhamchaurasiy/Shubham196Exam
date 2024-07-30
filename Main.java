import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double largest = Math.max(num1, Math.max(num2, num3));
        double average = (num1 + num2 + num3) / 3;

        System.out.println("The largest number is: " + largest);
        System.out.println("The sum of the largest number is: " + largest);
        System.out.println("The average of the three numbers is: " + average);
    }
}
