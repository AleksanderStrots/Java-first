import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("First number: ");
        double number1 = number.nextDouble();
        System.out.print("Second number: ");
        double number2 = number.nextDouble();
        max(number1, number2);
    }

    public static void max(double a, double b) {
        double maxNumber = Math.max(a, b);
        if(maxNumber == (int) maxNumber) {
            System.out.println((int) maxNumber);
        } else {
            System.out.println(maxNumber);
        }
    }
}
