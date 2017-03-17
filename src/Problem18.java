/**
 * Created by matthewconnorday on 10/12/15.
 */
public class Problem18 {

    int sumLength = 3;                                                                          // Change length of node summation (sum 3, take max and find max from that last node of that max summation)
    int inputLength = 15;
    int[][] triangle = new int[inputLength][inputLength];
    // Input data (easy to read / interpret)
    String input     =   "75 " +
                       "95 64 " +
                     "17 47 82 " +
                    "18 35 87 10 " +
                  "20 04 82 47 65 " +
                "19 01 23 75 03 34 " +
               "88 02 77 73 07 63 67 " +
              "99 65 04 28 06 16 70 92 " +
            "41 41 26 56 83 40 80 70 33 " +
           "41 48 72 33 47 32 37 16 94 29 " +
         "53 71 44 65 25 43 91 52 97 51 14 " +
       "70 11 33 28 77 73 17 78 39 68 17 57 " +
      "91 71 52 38 17 14 91 43 58 50 27 29 48 " +
    "63 66 04 68 89 53 67 30 73 16 69 87 40 31 " +
   "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23 ";

    public void call()
    {
        store();
    }

    public void store()
    {
        int num = 0;
        int length = 1;
        while(length<=inputLength) {
            for (int x = 0; x < length; x++) {
                //System.out.println(Integer.valueOf(input.substring(num,num+2)));
                triangle[length-1][x] = Integer.valueOf(input.substring(num,num+2));
                num += 3;
            }
            length++;
        }
    }

    public void traingleNumbers()                                                        // Node creator using triangle numbers
    {
        int sum = 0;

        for(int x = 1; x < inputLength; x++)                                             // For each row of the triangle
        {
            sum += x;
        }

        System.out.println("Sum of numbers is equal to: " + sum);
    }


}

class Problem18Node {

    Problem18Node downLeft, downRight, upLeft, upRight;

    public Problem18Node()
    {

    }

}

// Code Archival

/*
    public int max()
    {
        int max = 0;
        for(int y = 0; y < 15; y++)
        {
            if(sum(y) > max){max = sum(y);}
        }
        return max;
    }

    public int sum(int y)
    {
        int sum = 0;

        if(y == 0){}
        else if(0 < y && y < 14) {}
        else if(y == 14){}
        else {System.out.println("Error!");}

        return sum;
    }

    public void nodes()
    {
        String nodeName = "Placeholder";
        //Problem18Node nodeName. = new Problem18Node();                                              // Project on hold. Need variable variable names (ha)
    }

*/