package Interview.Math;

import java.util.Random;

/**
 * Created by matthewconnorday on 16/12/16.
 */
public class Rand {
    Random result = new Random();
    int thing;
    public void call(){
        for(int x = 0; x < 100; x++){
            System.out.println(rand7());
        }
    }

    public int rand5(){

        return result.nextInt(6);
    }

    public int rand7(){
        float another = (float) (rand5() * 7)/5;
        System.out.println(another);
        int foobar = (int) another;
        return foobar;
    }
}
