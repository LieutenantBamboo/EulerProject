package Interview.Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by matthewconnorday on 10/11/16.
 */
public class FrequentInt {

    int[] array = {1,1,3,3,3,4,5,5,6};
    HashMap<Integer,Integer> freq = new HashMap<Integer, Integer>();

    public void call(){System.out.println(freq());}

    public int freq() {
        int maxVal = 0, maxKey = 0;
        // Generate a hashmap using the array where the key is the number and the value is the number of occurrences
        for(int num : array)
        {
            if(freq.containsKey(num)) {freq.replace(num,freq.get(num)+1);}
            else {freq.put(num,1);}
        }

        for(int key : freq.keySet()){
            if(freq.get(key) > maxKey){maxKey = key;}
        }
        return maxKey;
    }
    // End of class
}

/* Old code

        Iterator it = freq.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            if((Integer)pair.getValue() > maxVal){maxKey = (Integer)pair.getKey();}
        }
        it.remove();

 */