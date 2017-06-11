import java.util.ArrayList;

/**
 * Created by matthewconnorday on 19/10/15.
 */
public class Main {
    public static void main(String[] args) {
        ErastosthenesSieve sieve = new ErastosthenesSieve(100000);
        ArrayList<Integer> primes = sieve.getPrimes();
        System.out.println(primes.toString());
    }
}
