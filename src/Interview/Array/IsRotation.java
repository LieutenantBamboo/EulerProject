package Interview.Array;

import java.util.Arrays;

/**
 * Created by matthewconnorday on 10/11/16.
 */
public class IsRotation {

    static int[] array1 = new int[] {1,2,3,4,5,6,7};
    int[] array2 = new int[] {4,5,6,7,1,2,3};
    static int[] array3 = new int[] {1,2,3,4,5,6,7};

    public static void main(String[] args) {
        IsRotation rotation= new IsRotation();
        rotation.call();
    }

    public void call(){
        System.out.println(isEqual(array1, array2));}

    /**
     * @param firstArray - the first array
     * @param secondArray - the second array
     * @return whether or not both arrays are rotations of each other
     */

    public boolean isEqual(int[] firstArray, int[] secondArray)
    {
        boolean isEqual = false;                                            // Assume not equal
        if(firstArray.length == secondArray.length) {                       // Check that array length is equal
            if(firstArray == secondArray){isEqual = true;}                  // Check if both arrays are equal
            for(int count = 0; count < secondArray.length; count++) {       // Loop through for the length of each array
                int[] rot = rotation(secondArray);                          // Set new array rot as the rotation of the secondArray
                if(Arrays.equals(firstArray, rot)){isEqual = true;}         // If the first array equals the rotated array, arrays are equal
                secondArray = rot;                                          // Set secondArray equal to the rot for next iteration
            }
         }
        return isEqual;
    }

    /**
     * @param array - the array to be rotated
     * @return a single iteration of the rotation
     */

    public int[] rotation(int[] array)
    {
        int firstElement = array[0];                                        // Set first element for reference
        for(int x = 0; x < array.length-1; x++)                             // Loop through for length of array
        {
            array[x] = array[x+1];                                          // Shift all elements one to the left
        }
        array[array.length-1] = firstElement;                               // Set first element to the end of the array

        return array;                                                       // Return the rotated array
    }
}