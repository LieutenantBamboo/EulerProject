/**
 * Created by matthewconnorday on 19/10/15.
 */
public class ProblemOne {
    int currentNumber=1;
    int sum=0;

    public void call(){summation();}

    public void summation() {
        while (currentNumber < 1000) {
            if (currentNumber % 3 == 0 || currentNumber % 5 == 0) {
                sum += currentNumber;
            }


            currentNumber++;
        }
        System.out.println(sum);
    }
}

