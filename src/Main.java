public class Main {

    public static void main(String[] args) {
        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);

        boolean f = false;
        System.out.println(f);
        boolean t = true;
        System.out.println(t);

        byte minByte = -128;
        System.out.println(minByte);
        byte maxByte = 127;
        System.out.println(maxByte);

        short minShort = -32768;
        System.out.println(minShort);
        short maxShort = 32767;
        System.out.println(maxShort);

        int minInt = -2147483648;
        System.out.println(minInt);
        int maxInt = 2147483647;
        System.out.println(maxInt);

        long minLong = -9223372036854775808L;
        System.out.println(minLong);
        long maxLong = 9223372036854775807L;
        System.out.println(maxLong);

        float minFloat = -3.4E+38f;
        System.out.println(minFloat);
        float maxFloat = 3.4E+38f;
        System.out.println(maxFloat);

        double minDouble = -1.7E+308;
        System.out.println(minDouble);
        double maxDouble = 1.7E+308;
        System.out.println(maxDouble);

        String s1 = "Java 1";
        String s2 = new String("Java 2");
        System.out.println(s1);

        int[] anArrayOfInt1 = new int[5];
        for (int i = 0; i < anArrayOfInt1.length; i++) {
            anArrayOfInt1[i] = i * 10;
            System.out.print(anArrayOfInt1[i] + " ");
        }
        System.out.println();
        int[] anArrayOfInt2 = {1, 2, 3, 4, 5};
        for(int i: anArrayOfInt2){
            System.out.print(i + " ");
        }
    }
}
