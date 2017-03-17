import java.util.ArrayList;
import java.util.List;

/**
 * Created by matthewconnorday on 29/11/16.
 */
public class RecursiveArraySum {

    private List<Integer> list = new ArrayList<>();

    public void call()
    {
        for(int x = 0; x < 5; x++){list.add(x);}
        sum(list);
    }

    public int sum(List<Integer> list)
    {
        int sum = 0;
        if(list.isEmpty()){return 0;}
        else{sum = list.get(0) + sum(list.subList(1,list.size()-1)); return sum;}
    }

}
