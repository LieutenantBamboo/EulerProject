/**
 * Created by matthewconnorday on 03/04/16.
 */
public class Problem31 {

    long ways = 1L;                                              // Start with 1 (2 pound coin with no others)

    public void call(){coins();}

    public void coins()
    {
        for(int pound = 0; pound <= 2; pound++)
        {
            for(int p50 = 0; p50 <= 4; p50++)
            {
                for(int p20 = 0; p20 <= 10; p20++)
                {
                    for(int p10 = 0; p10 <= 20; p10++)
                    {
                        for(int p5 = 0; p5 <= 40; p5++)
                        {
                            for(int p2 = 0; p2 <= 100; p2++)
                            {
                                for(int p1 = 0; p1 <= 200; p1++)
                                {
                                    if(((pound*100)+(p50*50)+(p20*20)+(p10*10)+(p5*5)+(p2*2)+(p1*1))==200){ways++;}
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ways);
    }

}
