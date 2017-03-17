import java.util.Arrays;

/**
 * Created by matthewconnorday on 03/04/16.
 */
public class Problem32 {

    int product;
    int sum = 0;
    int[] numbers = new int[10];
    boolean allGood = false;

    public void call(){panDigital();}

    public void panDigital()
    {
        for(int multiplicand = 0; multiplicand <= 999; multiplicand++)
        {
            for(int multiplier = 0; multiplier <= 999; multiplier++)
            {
                product = (multiplicand * multiplier);

                if((String.valueOf(multiplicand).length()+String.valueOf(multiplier).length()+String.valueOf(product).length())!=9){
                    //System.out.println("Wasn't of correct summed length")
                    }
                else {

                    for (int x = 0; x < String.valueOf(multiplicand).length(); x++) {
                        numbers[Integer.valueOf(String.valueOf(multiplicand).substring(x, x + 1))]++;
                        //System.out.println(Integer.valueOf(String.valueOf(multiplicand).substring(x, x + 1)));
                    }
                    for (int y = 0; y < String.valueOf(multiplier).length(); y++) {
                        numbers[Integer.valueOf(String.valueOf(multiplier).substring(y, y + 1))]++;
                        //System.out.println(Integer.valueOf(String.valueOf(multiplier).substring(y, y + 1)));
                    }
                    for (int z = 0; z < String.valueOf(product).length(); z++) {
                        numbers[Integer.valueOf(String.valueOf(product).substring(z, z + 1))]++;
                        //System.out.println(Integer.valueOf(String.valueOf(product).substring(z, z + 1)));
                    }
                    // If each number is detected once, add the products (of multiplicand and multiplier)
                    allGood = true;
                    if (numbers[0] != 0) {
                        allGood = false;
                    }
                    for (int count = 1; count < 10; count++) {
                        if (numbers[count] != 1) {
                            allGood = false;
                        }
                    }
                    Arrays.fill(numbers, 0);
                    if (allGood) {
                        sum += product;
                    }
                }
            }
        }
        System.out.println(sum/2);
    }
}
