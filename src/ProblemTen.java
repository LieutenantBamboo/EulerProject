/**
 * Created by matthewconnorday on 26/11/15.
 */
public class ProblemTen {
    Long sum = 0L;
    int limit = 2000000;
    boolean isPrimeNumber;

    boolean[] numberSpace = new boolean[limit];

    public void prime()                                         // Calculate the sum of the primes up to 2 000 000 (2 million) < Use Erastothene's Sieve>
    {
        populate();
        numberSpace[0] = false;
        sieve();
        sum();
        System.out.println("Sum is equal to: "+sum);

    }

    public void sieve()
    {
        for(int x = 2; x <= (limit/2); x++)
        {
            // System.out.println("\n <numbers for "+x+"> \n");
            for(int y = 2*x; y <= (limit); y += x)
            {
                // System.out.println((y)+" is false");
                numberSpace[y-1] = false;
            }
        }
    }

    public void sum()
    {
        for(int x = 0; x < limit; x++)
        {
            if(numberSpace[x])
            {
                sum += (x+1);
                // System.out.println(x+1);
            }

        }
    }

    public void populate()
    {
        for(int x = 0; x < limit; x++){numberSpace[x] = true;}
    }

    /*
    public void prime()                                         // Successful, but poorly optimized prime finder
    {
        // loop through the numbers, adding 2
        for (int i = 3; i < 200000; i += 2) {

            isPrimeNumber = true;

            // check to see if the number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                } else {}
            }

            if (isPrimeNumber) {sum += i;}
            else {}
        }
        System.out.println(sum);
    }
    */
}

