/**
 * Created by matthewconnorday on 24/11/15.
 */

public class ProblemThree {

    public Long factor(Long num) {
        // TODO code application logic here
        //long num = 600851475143L;

        long original = num;
        long max = (num);
        long highPrime = 1L;
        long multiple = 1L;
        System.out.println("Generate Prime numbers between 1 and " + max);

        // loop through the numbers, adding 2
        for (long i = 3L; i < max; i += 2) {

            boolean isPrimeNumber = true;

            // check to see if the number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                } else {
                }


            }
            if (isPrimeNumber = true && i != 1) {
                while ((num % i) == 0) {

                    num = (num / i);
                    highPrime = i;
                    multiple *= i;

                    //Sets new max prime factor

                }
            } else {
            }

            if (multiple == original) {
                break;
            }


        }
        System.out.println("The highest prime factor is: " + highPrime);
        System.out.println("this is the multiple of the factors: " + multiple);

        return highPrime;
    }
}


/*
public class ProblemThree {

    Long current = 1L;
    Long largest = 0L;
    public Long factor(Long num)            // Factor sub-routine
    {
        Long original = num;                // Set original for comparison
        while(current <= (original/2))      // While current number is smaller or equal to the highest possible factor
        {
            if((num % current)==0)          // If number is divisible by the current iterative
                {
                    num = num / current;    // Make the new number equal to the division of the factor
                    largest = current;      // Largest factor is the current number
                }
            else{current++;}                // If not divisible, iterate further

        }
        return largest;                     // Return the final answer (after loop terminates)
    }

}
*/