import java.util.ArrayList;

/**
 * Created by matthewconnorday on 01/12/15.
 */
public class ProblemTwelve {

    boolean found = false;
    int current;
    int count = 1;
    int divisors;
    ArrayList <String> triangleNumbers = new ArrayList();
    ArrayList <String> triangleDivisors = new ArrayList();

    public void triangle()
    {
        current = 0;
        while(!found){

            divisors = 2;
            current += count; //generate(count);
            if((current % 2) == 0){divisors += 2;}

            for (int j = 3; j < (current/2); j++) {
                if((current % j) == 0){divisors++;}

            }
            //System.out.println("\nNumber "+current+" has: "+divisors+" divisors\n");
            if(divisors > 500){found = true;}
            count++;
        }
        System.out.println("Answer is: "+current);
    }
    /*
    public int generate(int n)
    {
        int sum;
        if(n <= 1){sum = 1;}
        else{sum = n + generate(n-1);}
        return sum;
    }
    */

}
