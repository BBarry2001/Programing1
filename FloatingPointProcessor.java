import java.util.Scanner;

public class FloatingPointProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0, max = 0, min = Double.MAX_VALUE, value, average, interest;
        int counter = 0;

        while (counter < 5) {
            System.out.print("Enter a floating-point value: ");
            value = scanner.nextDouble();

            total += value;
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
            counter++;
        }

        average = total / 5;
        interest = total * 0.20;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on Total at 20%: " + interest);
    }
}
