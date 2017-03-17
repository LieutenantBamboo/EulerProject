package Interview;

import Interview.String.NonRepeated;

/**
 * Created by matthewconnorday on 10/11/16.
 */
public class Main {
    public static void main(String[] args) {

        NonRepeated nonRep = new NonRepeated("hama");
        nonRep.call();

    }
}

/*      int[][] array = new int[][]{
                {0,0,0,0,1,1,0},
                {1,0,0,0,1,0,1},
                {0,0,1,0,1,0,1},
                {1,0,1,0,0,0,1},
                {1,0,0,1,1,0,1},
                {0,1,1,1,0,1,1},
                {1,0,0,0,0,0,0}};
        Islands island = new Islands(array);
        island.call();
*/

/*
        int[] array = new int[] {1,2,2,5,6,6,9,9,9};
        BinarySearch search = new BinarySearch(array, 9);
        System.out.println(search.isIn());
*/