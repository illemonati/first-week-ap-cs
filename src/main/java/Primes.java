import java.util.ArrayList;

public class Primes {

    public Primes() {}

    public Primes(long n) {
        this.primes = findPrimeUpTo(n);
    }

    public Primes(int n) {
        this.primes = findPrimeUpTo(n);
    }

    private ArrayList<Long> primes = new ArrayList<Long>();

    public static ArrayList<Long> findPrimeUpTo(long n){
        ArrayList<Long> list_o_long = new ArrayList<Long>();
        long i = 2;
        while (list_o_long.size() < n) {
            if (isPrime(i)) {
                list_o_long.add(0, i);
            }
            i++;
        }
        return list_o_long;
    }

    public static ArrayList<Long> findPrimeUntil(long n){
        ArrayList<Long> list_o_long = new ArrayList<Long>();
        long i = 2;
        while (i <= n) {
            if (isPrime(i)) {
                list_o_long.add(0, i);
            }
            i++;
        }
        return list_o_long;
    }

    public static boolean isPrime(long n){
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //getters and setters
    public ArrayList<Long> getPrimes() {
        return primes;
    }

}
