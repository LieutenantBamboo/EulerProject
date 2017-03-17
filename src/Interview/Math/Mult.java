package Interview.Math;

/**
 * Created by matthewconnorday on 14/12/16.
 */
public class Mult {

    int first, second;

    public Mult(int first, int second){
        this.first = first;
        this.second = second;
    }

    public void call(){System.out.println(mult(first,second));}

    /**
     * @param firstNum - first number to be multiplied
     * @param secondNum - second number to be multiplied
     * @return the product of both numbers
     * The purpose of this method is to multiply without the use of the product symbol,
     * using the definition of multiplication (firstNum + firstNum + firstNum.....) secondNum amount of times
     */

    public int mult(int firstNum, int secondNum) {
        int result = 0;

        for(int x = 0; x < secondNum; x++){result += firstNum;}

        return result;
    }

}
