package Interview.Sort;

/**
 * Created by matthewconnorday on 18/12/16.
 */
public class SelectionSort {

    int[] array;

    public SelectionSort(int[] array){this.array = array;}

    public int[] call(){sort(); return array;}

    public void sort(){
        int min = array[0]; int[] sorted = new int[array.length];
        for(int x = 0; x < array.length - 1; x++){
            for(int y = x; y < array.length - 1; y++){
                if(array[y] < min){min = array[y];}
            }
            sorted[x] = min;
        }
        array = sorted;
    }

}
