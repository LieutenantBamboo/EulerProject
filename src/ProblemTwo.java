/**
 * Created by matthewconnorday on 19/10/15.
 */

public class ProblemTwo { // Summation of all
    int sum = 0;
    int currentnum = 1;
    int previousnum=0;
    int temp;

    public void summation() {

        while (currentnum < 4000000) {

            if ((currentnum % 2) == 0) {
                sum += currentnum;
            }
            temp = currentnum;
            currentnum = fib(currentnum, previousnum);
            previousnum = temp;

        }
        System.out.println(sum);
    }


    public int fib(int num, int prev) {

        int output = num + prev;

        return output;
    }


}

