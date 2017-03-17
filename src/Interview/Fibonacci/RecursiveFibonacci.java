package Interview.Fibonacci;

/**
 * Created by matthewconnorday on 10/11/16.
 */
public class RecursiveFibonacci {

    public void call(){}

    public int fibonacci(int n)
    {
        if(n == 0){return 0;}
        else if(n == 1){return 1;}
        else{return fibonacci(n-1) + fibonacci(n-2);}
    }
}
