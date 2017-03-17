/**
 * Created by matthewconnorday on 26/11/15.
 */
public class ProblemNine {

    public void triplet()
    {
        for(int a = 0; a < 1000; a++){
            for(int b = 0; b < 1000; b++){
                for(int c = 0; c < 1000; c++){

                    if((a < b) && (b < c) && ((a+b+c)==1000) && ((a*a)+(b*b)==(c*c)))
                    {
                        System.out.println("Answer is: "+a+" * "+b+" * "+c+" = "+(a*b*c));
                    }

                }
            }
        }
    }
}
