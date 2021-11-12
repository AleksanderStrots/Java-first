import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Min number: ");
        int min = number.nextInt();
        System.out.print("Max number: ");
        int max = number.nextInt();
        Interval.minMax(min, max);
    }

    public static void minMax(int min, int max) {
        for (int i = 2; i <= max; i++) {
            if (i < min) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}