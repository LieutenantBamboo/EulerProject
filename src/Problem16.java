import java.math.BigInteger;

/**
 * Created by matthewconnorday on 08/12/15.
 */
public class Problem16 {

    int exp = (int) Math.pow(10, 3);                                                    // Calculating 1000 (10^3)
    BigInteger answer = BigInteger.valueOf(2).pow(exp);                                 // (Original) Answer is equal to 2^exp = 2^1000
    int sum = 0, current = 0;

    public void call(){sumOfDigits();}

    public void sumOfDigits()
    {
        System.out.println("Original number is: " + answer);
        System.out.println("Number of digits are: " + answer.toString().length());

        for(int x = 0; x < answer.toString().length(); x++)
        {
            current = Integer.parseInt(answer.toString().substring((x),(x+1)));
            sum += current;
        }

        System.out.println("Sum of digits are: " + sum);

    }


}
