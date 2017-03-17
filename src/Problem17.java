
/**
 * Created by matthewconnorday on 08/12/15.
 */
public class Problem17 {                            // Note for future self. Find a library to convert a certain number into a word. Code Regex ftw

    String word;
    int length, totalLength = 11;

    public void call(){createNumDict(); length();}

    public void length()
    {
        for(int x = 1; x < 1000; x++)
        {
            length = word(x);
        }
        totalLength += length;
    }

    public void createNumDict()
    {

    }

    public int accessNumDict(int num, int position)
    {
        int value = 0;
        //if(position)
        return value;
    }

    public int word(int number)
    {
        int length = 0;
        for(int y = 0; y < String.valueOf(number).length(); y++)
        {

        }
        return length;
    }

}
