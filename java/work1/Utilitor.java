package work1;

public class Utilitor {

    public static String testString(String value) {
        if (value.isBlank()) {
            throw new IllegalArgumentException();
        } else if (value == null) {
            throw new NullPointerException();
        }
        return value;
    }

    public static double testPositive(double value) {
        if (value >= 0.00) {
            return value;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static long computeIsbn10(long isbn10) {
        int mod = 2;
        long spa = isbn10;
        long ans = 0;
        long digit;
        for (; mod < 11; mod++) {
            digit = (spa % 10) * mod;
            spa = spa / 10;
            ans += digit;
        }
        System.out.println(ans);
        ans %= 11;
        ans = 11 - ans;
        return ans;

    }

}
