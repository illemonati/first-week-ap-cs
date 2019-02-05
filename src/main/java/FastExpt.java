public class FastExpt {

    public static long fastExpt(long b, long n) {
        long a = 1;
        long b2 = b;
        long n2 = n;

        while (n2 != 0) {
            if (n2 % 2 == 0) {
                b2 = b2*b2;
                n2 = n2 / 2;
            } else {
                n2--;
                a = a * b2;
            }
        }
        return a;
    }
}
