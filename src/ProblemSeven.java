/**
 *
 *
 * Created by matthewconnorday on 25/11/15.
 */
public class ProblemSeven {

    public void call(){prime();}

    /* Field vatiables */
    int current = 3;
    int count = 1;
    boolean isPrimeNumber;

    /** main call method */

    public void prime()
    {
        // loop through the numbers, adding 2
        while(count<10001) {

            isPrimeNumber = true;

            // check to see if the number is prime
            for (int j = 2; j < current; j++) {
                if (current % j == 0) {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                } else {}
            }
            if(isPrimeNumber){count++; current+=2;}
            else{current+=2;}
        }
        System.out.println(current-2);
    }
}
