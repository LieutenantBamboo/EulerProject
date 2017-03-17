import java.math.BigInteger;

/**
 * Created by matthewconnorday on 02/12/15.
 */
public class ProblemFourteen {
    BigInteger current = new BigInteger("0");
    Long count = 0L;
    Long max = 0L;
    Long index = 0L;
    Long temp = 0L;
    BigInteger zero = new BigInteger("0");
    BigInteger one = new BigInteger("1");
    BigInteger two = new BigInteger("2");
    BigInteger three = new BigInteger("3");

    public void call()
    {
        thing();
    }

    public void thing()                                                        // Iterative sub-routine for the Collatz Sequence
    {
        for(Long x = 1L; x <= 1000000L; x++)                                   // Iterating through all starting numbers from 1 to 1,000,000
        {
            current = BigInteger.valueOf(x);                                   // Current number set by the for loop
            count = 1L;
            while(!current.equals(one))                                        // While the number is not equal to 1 (loop termination)
            {
                //System.out.println("Number is: " + current);
                if((current.mod(two)).equals(zero))                            // If the number if even:
                {
                    temp = Long.valueOf(current.toString());
                    current = (current.divide(two));                           // Halve it
                    //System.out.println("(" + temp + " / 2) = " + current);
                }
                else                                                           // Else (if the number is odd):
                {
                    temp = Long.valueOf(current.toString());
                    current = ((current.multiply(three)).add(one));            // Multiply by three and add one
                    //System.out.println("(" + temp + " * 3) + 1 = " + current);
                }
                count++;                                                       // Increase count (Sequence length)
            }
            if(count > max){max = (count);                                     // If the sequence length of the current starting number is longer than a previously recorded, replace as new max
            index = x;}
        }
        System.out.println("Max length is: "+max+"\nIndex of max is: " + index);                                    // Print out the final answer
    }
}

/* BigInteger copy

import java.math.BigInteger;

public class ProblemFourteen {
    BigInteger current = new BigInteger("0");
    Long count = 0L;
    Long max = 0L;
    Long index = 0L;
    BigInteger zero = new BigInteger("0");
    BigInteger one = new BigInteger("1");
    BigInteger two = new BigInteger("2");
    BigInteger three = new BigInteger("3");

    public void call()
    {
        thing();
    }

    public void thing()                                                        // Iterative sub-routine for the Collatz Sequence
    {
        for(Long x = 1L; x <= 1000000L; x++)                                   // Iterating through all starting numbers from 1 to 1,000,000
        {
            current = BigInteger.valueOf(x);                                   // Current number set by the for loop
            count = 0L;
            while(!current.equals(one))                                        // While the number is not equal to 1 (loop termination)
            {
                if((current.mod(two)).equals(zero))                            // If the number if even:
                {
                    current = (current.divide(two));                           // Halve it
                }
                else                                                           // Else (if the number is odd):
                {
                    current = ((current.multiply(three)).add(one));            // Multiply by three and add one
                }
                count++;                                                       // Increase count (Sequence length)
            }
            if(count > max){max = (count+1);                                   // If the sequence length of the current starting number is longer than a previously recorded, replace as new max
                index = x;}
        }
        System.out.println(max+"\n"+index);                                    // Print out the final answer
    }
}

 */