package Interview.Fibonacci;

/**
 * Created by matthewconnorday on 10/11/16.
 */
public class DynamicFibonacci {
    int num;
    int[] fib;

    public DynamicFibonacci(int num)
    {
        this.num = num;
        fib = new int[num];
    }

    public void call(){fibonacci(num);}

    public int fibonacci(int n)
    {
        if(n == 0){return 0;}
        else if(n == 1){return 1;}
        else if(fib[n-1] == 0){fib[n-1] = fibonacci(n-1);}
        else if(fib[n-2] == 0){fib[n-2] = fibonacci(n-2);}

        return fib[n];
    }
}
