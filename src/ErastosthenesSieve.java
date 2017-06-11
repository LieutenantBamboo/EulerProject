import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by matthewconnorday on 02/11/16.
 */
public class ErastosthenesSieve {
    private int bound;
    private boolean[] primes;

    public ErastosthenesSieve(int bound) {
        this.bound = bound;
        primes = new boolean[bound];
        Arrays.fill(primes, Boolean.TRUE);
        primes[0] = false;                  // 1 is not a prime number
        primes[1] = false;                  // Likewise with 2
        sieve();
    }

    /**
     * Erastothenes sieve algorithm
     */

    public void sieve() {
        for (int x = 2; x < Math.ceil(Math.sqrt(bound)); x++) {
            if (primes[x]) {
                for (int num = (int) Math.pow(x, 2); num < bound; num += x) {
                    primes[num] = false;
                }
            }
        }
    }

    /**
     * Adds all primes into an array list using the true boolean array values
     * Complexity: O(n)
     * @return the array list of primes
     */

    public ArrayList<Integer> primes() {
        ArrayList<Integer> foobar = new ArrayList<Integer>();
        for (int z = 0; z < bound; z++) {
            if (primes[z]) {
                foobar.add(z);
            }
        }
        return foobar;
    }

    /* Result related methods */

    public void print() // Prints all true (prime) values in the prime array
    {
        for (int z = 0; z < bound; z++) {
            if (primes[z]) {
                System.out.println(z);
            }
        }
    }

    // Getters

    public ArrayList<Integer> getPrimes() {
        return primes();
    }

    public boolean[] getPrimeBooleans() {
        return primes;
    }
}
