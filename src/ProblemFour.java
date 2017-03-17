/**
 * This class attempts to find the largest palindrome that is a product
 * of two numbers that may range from 100 to 999
 *
 * Created by matthewconnorday on 24/11/15.
 */
public class ProblemFour {
    static int answer;
    static int mult1;
    static int mult2;


    public static void main(String[] args) {
        ProblemFour prob = new ProblemFour();
        prob.palindrome();
    }

    /**
     * Main class call method
     * */

    public void palindrome()
    {

        for(int x = 100; x<1000; x++)
        {
            for(int y = 100; y<1000; y++)
            {
                if(checkSymmetry(x*y) && ((x*y) > answer))
                {
                    answer = x*y;
                    mult1 = x;
                    mult2 = y;
                }
            }
        }

        System.out.println("Largest palindrome is: " + answer + ", a product of " + mult1 + " and " + mult2);
    }

    /**
     * @param product - the product of two numbers
     * @return whether or not a number is a palindrome
     * */

    public boolean checkSymmetry(int product)
    {
        boolean answer;
        String string = String.valueOf(product);

        String half1 = string.substring(0,string.length()/2);
        String half2 = new StringBuffer(string.substring(string.length()/2,string.length())).reverse().toString();

        answer = (half1.equals(half2));

        return answer;
    }
}

/* Old Working
    String thing = "Name";
        System.out.println(thing.substring(0,thing.length()/2));
        System.out.println(thing.substring(thing.length()/2,thing.length()));
*/