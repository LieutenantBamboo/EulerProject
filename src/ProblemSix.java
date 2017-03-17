/**
 * Created by matthewconnorday on 25/11/15.
 */
public class ProblemSix {
    int answer;
    int limit = 101;

    /**
     * @return the difference betwee (x^2 + y^2) and (x + y)^2 = 2xy
     */
    public int difference()
    {
        answer = (sumSqaured(limit))-(sumOfSqaures(limit));
        return answer;
    }

    /**
     *  (x^2 + y^2)
     * @param number - the limit of the sum of squares
     * @return the sum of squares up until a given number (the param)
     */

    public int sumOfSqaures(int number)
    {
        int sum = 0;                                            // Initialise sum
        for(int x = 0; x < number; x++){sum += (x*x);}          // Loops through up til the number (the limit)
        return (sum);                                           // Returns the sum of squares
    }

    /**
     * (x + y)^2
     * @param number - the limit of the sum squared
     * @return the square of the sum up until the limit
     */

    public int sumSqaured(int number)
    {
        int sum = 0;                                            // Initialise sum
        for(int x = 0; x < number; x++){sum += x;}              // Loops through up til the number (the limit)
        return (sum*sum);                                       // Returns the square of the sum
    }
}
