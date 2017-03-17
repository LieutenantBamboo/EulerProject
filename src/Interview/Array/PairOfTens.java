package Interview.Array;

/**
 * Created by matthewconnorday on 10/11/16.
 *
 * Tries to search an array for a pair of elements that adds up to 10
 */

public class PairOfTens {

    public void call(){}


    /**
     * Big O = O(n^2)
     * Brute force, not very effective, but will work on an unsorted array
     *
     * @param array - the arary to be checked for a pair
     * @return the number of pairs present
     */
    public int bruteForcePair(int[] array)
    {
        int result = 0;

        for(int x = 0; x < array.length; x++){
            for(int y = 0; y < array.length; y++){
                if(array[x] + array[y] == 10){result++;}
            }
        }

        return result;
    }

    /**
     * Big O = O(n)
     * While in linear time, array must be sorted to work
     *
     * @param array - the arary to be checked for a pair
     * @return the number of pairs present
     */

    public int searchForPair(int[] array){
        int leftIndex = 0, rightIndex = array.length-1, result = 0;

        for(int x = 0; x < array.length; x++){
            if(array[leftIndex] < 10 && array[rightIndex] < 10){}
            else if(array[leftIndex] >= 10 && array[rightIndex] < 10){}
            else if(array[leftIndex] < 10 && array[rightIndex] >= 10){}
        }

        return result;
    }
}
