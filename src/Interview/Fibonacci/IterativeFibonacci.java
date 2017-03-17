package Interview.Fibonacci;

/**
 * Created by matthewconnorday on 10/11/16.
 */
public class IterativeFibonacci {

    public void call(){}

    public int finboncci(int n)
    {
        int result = 0, num1 = 0, num2 = 1;
        for(int count = 0; count < n; count++)
        {
            result += num1 + num2;
            num2 = result; num1 = num2;
        }

        return result;
    }

}
