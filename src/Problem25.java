import java.math.BigInteger;

/**
 * Created by matthewconnorday on 03/04/16.
 */
public class Problem25 {

    int n = 0;

    public void call()
    {
        fib();
    }

    public void fib()
    {
        boolean found = false;
        BigInteger num1 = new BigInteger("0");
        BigInteger num2 = new BigInteger("1");
        BigInteger num3 = new BigInteger("1");
        long index = 1;

        while (!found)
        {
            num3 = num2.add(num1);
            if(num3.toString().length()>=1000){found = true;}
            num1 = num2; num2 = num3; index++;
        }

        System.out.println(num3);
        System.out.println(index);
    }
}
