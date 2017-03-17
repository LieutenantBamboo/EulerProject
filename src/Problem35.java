import java.util.ArrayList;

/**
 * Created by matthewconnorday on 12/07/16.
 */
public class Problem35 {

    int upperBound = 100;
    ArrayList<Integer> primes = new ArrayList<Integer>();
    ArrayList<Integer> circular = new ArrayList<Integer>();

    public void call()
    {
        // Call sieve: produce all prime numbers below one million
        sieve();
        // Call checkPrimes: find all circular primes from list produced in sieve
        checkPrimes();
        // Print out the result
        System.out.println("There are :" + circular.size() + " circular primes");
    }

    public void sieve() // Erastosthenes Sieve algorithm for all primes up to one million
    {
        ErastosthenesSieve sieve = new ErastosthenesSieve(upperBound);
        primes.addAll(sieve.primes());
    }

    public void checkPrimes() // Checks for circular primes using the 'circular' ArrayList
    {
        for(Integer num : primes) {
            // Check if the number has a circular set
                if(circular(num))
                {
                    circular.add(num);
                }
        }
    }

    public boolean circular(int num)
    {
        boolean circ = false;
        ArrayList<Integer> rotation = new ArrayList<Integer>(String.valueOf(num).length());
        for(int x = 0; x < String.valueOf(num).length(); x++) {
            rotation.add(rotate(num));
        }
        if(primes.containsAll(rotation)){circ = true;}
        return circ;
    }

    public int rotate(int number)
    {
        char[] digits = String.valueOf(number).toCharArray();

        char temp = digits[0];
        for(int z = 0; z < digits.length - 1; z++){digits[z] = digits[z+1];}
        digits[digits.length-1] = temp;
        number = Integer.parseInt(new String(digits));

        return number;
    }
}
