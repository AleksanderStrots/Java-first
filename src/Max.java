import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("First number: ");
        int number1 = number.nextInt();
        System.out.print("Second number: ");
        int number2 = number.nextInt();
        max(number1, number2);
    }

    public static void max(int a, int b) {
        System.out.println(Math.max(a, b));
    }
}
