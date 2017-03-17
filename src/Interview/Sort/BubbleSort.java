package Interview.Sort;

/**
 * Created by matthewconnorday on 18/12/16.
 */
public class BubbleSort {

    int[] array;

    public BubbleSort(int[] array){this.array = array;}

    public int[] call(){sort(); return array;}

    public void sort(){
        for(int x = 0; x < array.length - 2; x++){
            for(int y = x; y < array.length - 2; y++){
                if(array[y] < array[y+1]){
                    int temp = array[y+1];
                    array[y+1] = array[y];
                    array[y] = temp;
                }
            }
        }
    }

}
