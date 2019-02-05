import java.util.ArrayList;

public class BrilliantNumbers {

    public BrilliantNumbers() {};

    public BrilliantNumbers(long n) {
        this.brilliant_numbers = findBrilliantsUpTo(n);
    }

    public BrilliantNumbers(int n) {
        this.brilliant_numbers = findBrilliantsUpTo(n);
    }

    private ArrayList<Long> brilliant_numbers = new ArrayList<Long>();

    public static ArrayList<Long> findBrilliantsUpTo(long n) {
        ArrayList<Long> list_o_brilliants = new ArrayList<Long>();
        long i = 2;
        while (list_o_brilliants.size() < n) {
            if (isBrilliant(i)) {
                list_o_brilliants.add(0, i);
            }
            i++;
        }
        return list_o_brilliants;
    }


    public static boolean isBrilliant(long n) {
        ArrayList<Long> list_o_primes_under_n = Primes.findPrimeUntil(n);
        for (long i: list_o_primes_under_n) {
            if (n % i != 0){
                continue;
            }
            long f2 = n / i;

            if (list_o_primes_under_n.contains(f2)) {
                long digits_o_f2 = String.valueOf(f2).length();
                long didits_o_i = String.valueOf(i).length();
                if (didits_o_i == digits_o_f2){
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList<Long> getBrilliant_numbers() {
        return brilliant_numbers;
    }
}
