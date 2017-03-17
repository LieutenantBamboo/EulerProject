/**
 * Created by matthewconnorday on 04/08/16.
 */
public class Problem36 {

    public void call()
    {
        palindrome();
    }

    public void palindrome()
    {
        long answer = 0L;

        for(int x = 1; x < 1000000; x++)
        {
            String binary = Integer.toBinaryString(x);
            if(((x)==Integer.valueOf(new StringBuffer(x).reverse().toString())) && (binary.equals(new StringBuffer(binary).reverse().toString()))) // If both are palindromic
            {
                answer += x;
            }
        }

        System.out.println(answer);
    }
}
