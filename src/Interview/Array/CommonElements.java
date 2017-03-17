package Interview.Array;

import java.util.ArrayList;

/**
 * Created by matthewconnorday on 10/11/16.
 */
public class CommonElements {

    public void call(){System.out.println(common(new int[]{1, 2, 3, 4, 5, 5}, new int[]{4, 5, 5, 6, 7, 8}));}

    public ArrayList<Integer> common(int[] firstArray, int[] secondArray) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        // Check cartesian product of both arrays
        for(int fir : firstArray){
            for(int sec : secondArray){
                // If the two values in each subset are equal and each are not already in results
                if((fir == sec) && (!results.contains(fir))){
                    results.add(fir);
                }
            }
        }

        return results;
    }


}
