import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by matthewconnorday on 02/11/16.
 */
public class ErastosthenesSieve {
    private int bound;
    private boolean[] primes;

    public ErastosthenesSieve(int bound)
    {
        this.bound = bound;
        primes = new boolean[bound];
        Arrays.fill(primes, Boolean.TRUE);
        primes[0] = false; primes[1] = false;
        sieve();
    }

    /** Erastothenes sieve algorithm */

    public void sieve()
    {
        for(int x = 2; x < (Math.sqrt(bound)); x++)
        {
            if(primes[x] = true) {
                for (int num = (int) Math.pow(x, 2); num < bound; num += x) {
                    primes[num] = false;
                }
            }
        }
    }

    /** Adds all primes into an array list using the boolean array
     * @return the array list of primes
     */

    public ArrayList<Integer> primes()
    {
        ArrayList<Integer> foobar = new ArrayList<Integer>();
        for(int z = 0; z < bound; z++){
            if(primes[z]){
                foobar.add(z);
            }
        }
       return foobar;
    }

    /* Result related methods */

    public void print() // Prints all true (prime) values in the prime array
    {for(int z = 0; z < bound; z++){if(primes[z]){System.out.println(z);}}}
    public ArrayList<Integer> getPrimes(){return primes();}
    public boolean[] getPrimeBooleans(){return primes;}
}
