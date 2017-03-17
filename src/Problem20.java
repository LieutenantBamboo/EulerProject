import java.math.BigInteger;

/**
 * Created by matthewconnorday on 15/03/16.
 */
public class Problem20 {

    BigInteger factNum = new BigInteger("1");
    int factValue = 100;

    public void call()
    {
        calculate();
        System.out.println("Sum of digits is: " + sum());
    }
    public void calculate()
    {
        for(long y = 2; y <= factValue; y++)
        {
            factNum = factNum.multiply(BigInteger.valueOf(y));
        }
        System.out.println(factNum);
    }
    public int sum()
    {
        int sum = 0;
        for(int x = 0; x < factNum.toString().length(); x++)
        {
            sum += Integer.parseInt(factNum.toString().substring(x,x+1));
        }
        return sum;
    }
}
