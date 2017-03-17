/**
 * Created by matthewconnorday on 28/06/16.
 */
public class Problem34 {

    long totalSum = 0L;
    int[] fact = new int[10];

    public void call(){generate(); curious();}

    // Generate factorials once for access rather than computation
    public void generate()
    {
        // For loop rather than recursion to easily append each factorial to the array
        int curFact = 1;
        for(int x = 1; x < 11; x++)
        {
            fact[x-1] = curFact;
            curFact *= x;
        }
    }

    // Curious number finder
    public void curious()
    {
        // For every number up the the mathematically found upper bound
        for(int count = 3; count < 220000; count++)
        {
            int sum = 0;
            for(int x = 0; x < String.valueOf(count).length(); x++)
            {
                sum += fact[Integer.valueOf(String.valueOf(count).substring(x, x + 1))];
            }
            // If the sum of the factorial digits is equal to the number itself
            if(sum == count){totalSum += count;}
        }
        System.out.println(totalSum);
    }
}
