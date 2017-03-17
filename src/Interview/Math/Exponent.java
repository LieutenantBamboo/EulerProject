package Interview.Math;

/**
 * Created by matthewconnorday on 14/12/16.
 */
public class Exponent {

    int base, power;

    public Exponent(){
        this.base = base;
        this.power = power;
    }

    public void call(){exponent(base,power);}

    /**
     * @param baseNum - Base of the exponent
     * @param powerNum - Power of the exponent
     * @return The exponent (base multiplied by itself n times)
     * The algorithm is hence linear, as it will take n iterations of the loop to complete
     */
    public int exponent(int baseNum, int powerNum)
    {
        for(int x = 0; x < powerNum; x++){
            baseNum *= baseNum;
        }

        return baseNum;
    }
}
