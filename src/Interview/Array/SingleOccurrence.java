package Interview.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by matthewconnorday on 15/12/16.
 */
public class SingleOccurrence {

    HashMap<Integer,Integer> keep = new HashMap<>();

    public void call(int[] array){
        System.out.println(single(array));
    }

    public int single(int[] array){
        int num = 0;

        for(int thing : array){
            if(keep.get(thing) != null){}
            else{keep.put(thing, 1);}
        }

        return num;
    }
}
