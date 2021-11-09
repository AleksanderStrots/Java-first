public class Main {

    public static void main(String[] args) {
        char minChar = 0;
        char maxChar = 255;

        boolean f = false;
        boolean t = true;

        byte minByte = -128;
        byte maxByte = 127;

        short minShort = -32768;
        short maxShort = 32767;

        int minInt = -2147483648;
        int maxInt = 2147483647;

        long minLong = -9223372036854775808L;
        long maxLong = 9223372036854775807L;

        float minFloat = -3.4E+38f;
        float maxFloat = 3.4E+38f;

        double minDouble = -1.7E+308;
        double maxDouble = 1.7E+308;

        String s1 = "Java 1";
        String s2 = new String("Java 2");

        int[] anArrayOfInt1 = new int[5];
        for (int i = 0; i < anArrayOfInt1.length; i++) {
            anArrayOfInt1[i] = i * 10;
            System.out.print(anArrayOfInt1[i] + " ");
        }
        int[] anArrayOfInt2 = {0, 10, 20, 30, 40};

        byte[] anArrayOfBytes = new byte[5];
        short[] anArrayOfShorts = new short[5];
        long[] anArrayOfLongs = new long[5];
        float[] anArrayOfFloats = new float[5];
        double[] anArrayOfDoubles = new double[5];
        boolean[] anArrayOfBooleans = new boolean[5];
        char[] anArrayOfChars = new char[5];
        String[] anArrayOfStrings = new String[5];
    }
}
