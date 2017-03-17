/**
 * Find the first multiple of 20 that is divisible by all numbers from 1 to 20
 *
 * Created by matthewconnorday on 25/11/15.
 */
public class ProblemFive {

    public static void main(String[] args) {
        ProblemFive prob = new ProblemFive();
        prob.division();
    }


    /* Field variables */
    int current = 20;
    public static boolean divisible;

    /** Main problem class call method */

    public void division()
    {
        boolean found = false;
        while(!found)
        {
            divisible = check(current);

            if(divisible){found = true;}
            else{current += 20;}
        }
        System.out.println(current);
    }

    /**
     * @param num - the multiple of 20 to check for
     * @return whether or not it is divisible by all numbers from 1 to 20
     */

    public boolean check(int num)
    {
        boolean result = true;                       // Assume number is divisible by all
        for(int x = 1; x < 21; x++)
        {
            if((num % x) != 0)                       // If number is not divisible by something between 1 and 20
            {
                result = false;                      // Assign false
            }
        }
        return result;                               // Return the boolean
    }

}
