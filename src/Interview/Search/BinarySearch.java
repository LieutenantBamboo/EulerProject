package Interview.Search;

/**
 * Created by matthewconnorday on 10/11/16.
 */
public class BinarySearch {

    /** The class-wide array for the invoked search instance */
    public int[] sorted;
    /** The number searched for */
    public int num;

    public BinarySearch(int[] sorted, int num)
    {
        this.sorted = sorted;
        this.num = num;
    }

    /** Default method that tests all methods in the class */

    public void call(){isIn();}

    /**
     * @return the truth value of whether a value is in an array
     */

    public boolean isIn()
    {
        boolean isIn = false, done = false;
        int cur = sorted.length/2, up = sorted.length, down = 0;
        int occurences = 1;

        while(!done)
        {
            if(down <= up) {                                         // If the upper boundary is greater than the lower boundary, either array is not sorted or value is not present
                if (num > sorted[cur]) {
                    cur = (sorted.length + cur) / 2;
                } else if (num < sorted[cur]) {
                    cur = (cur / 2);
                } else {
                    done = true;
                    if ((cur != 0) && (cur != sorted.length - 1) && ((sorted[cur - 1] == sorted[cur]) || (sorted[cur + 1] == sorted[cur]))) {
                        isIn = true;
                        System.out.println("Found at index: " + cur);
                        occurences += multCheck(cur);

                        System.out.println("Multiple occurences found. Number counted: " + occurences);
                    } else {
                        System.out.println("Single occurence found it at index: " + cur);
                    }
                }
            } else {done = true;}
        }
        System.out.println(occurences);
        return isIn;
    }

    /**
     * @param cur - the current array index
     * @return the number of additional occurences of the found number
     *
     */
    public int multCheck(int cur)
    {
        int curCopy = cur, additional = 0;

        if(curCopy != 0) {    // Check all indexes larger than the found index for additional occurrences
            while (sorted[curCopy-1] == num && !((curCopy-1) <= 0)) {
                curCopy--;
                if (sorted[curCopy] == num) {additional++;}
            }
        }

        curCopy = cur;

        if(curCopy != sorted.length-1) {    // Check all indexes larger than the found index for additional occurrences
            while (sorted[curCopy+1] == num && !((curCopy+1) >= sorted.length - 1)) {
                curCopy++;
                if (sorted[curCopy] == num) {additional++;}
            }
        }

        return additional;
    }
}
