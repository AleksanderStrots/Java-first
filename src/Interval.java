public class Interval {
    public static void main(String[] args) {
        Interval.minMax(2, 29);
    }

    public static void minMax(int min, int max) {
        for (int i = min; i <= max; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}