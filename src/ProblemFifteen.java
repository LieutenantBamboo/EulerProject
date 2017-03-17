/**
 * Created by matthewconnorday on 03/12/15.
 */
public class ProblemFifteen {
    static int gridSize = 20;
    static Long routes = 0L;
    public static long[][] pathNums = new long[gridSize+1][gridSize+1];



    public void call()
    {
        pathNums[0][0] = 1; boolean done = false, diagDone = false;
        int X = 0,Y = 0;  // x represents x-axis and y represents the y-axis

        while(!done)
        {
            while(!diagDone)
            {
                path(X,Y);
                if((Y==0)||(X==gridSize)){diagDone=true;}
                else{X+=1; Y-=1;}
            }
            if(X==gridSize&&Y==gridSize){done=true;}
            else if(X == gridSize){X = Y + 1; Y = gridSize;}
            else{Y=X+1; X=0;}
            diagDone = false;
        }

        System.out.println("\nThere are: "+pathNums[gridSize][gridSize]+" routes");
    }

    public void path(int x, int y)
    {
            if(pathNums[x][y] == 0)
        {
            if(x == 0)
            {
                pathNums[x][y] += pathNums[x][y-1];
            }
            else if(y == 0)
            {
                pathNums[x][y] += pathNums[x-1][y];
            }
            else
            {
                pathNums[x][y] += pathNums[x-1][y];
                pathNums[x][y] += pathNums[x][y-1];
            }

        }
        else
        {
            System.out.println("So it begins...");
        }


    }





/*
    public void path(int x, int y)                                                              // Recursive method that maps every possible route
    {
        if(pathNums[x][y] == 0) {
            int tempX = x, tempY = y;
            //System.out.println(tempX+" , "+tempY);

            if ((tempX >= gridSize) && (tempY >= gridSize)) {
                //System.out.println("Finished");
                routes++;
            } else if (tempX >= gridSize) {
                tempY++;
                //System.out.println("Down at side edge");
                path(tempX, tempY);
            } else if (tempY >= gridSize) {
                tempX++;
                //System.out.println("Right at bottom edge");
                path(tempX, tempY);
            } else if ((tempX < gridSize) && (tempY < gridSize)) {
                int rightX = tempX, rightY = tempY;
                int downX = tempX, downY = tempY;

                rightX++;
                //System.out.println("Send one to the right");
                path(rightX, rightY);

                downY++;
                //System.out.println("Send one downwards");
                path(downX, downY);

            } else {
                System.out.println("Error detected");
            }
        }
    }
/*





    /*

    public void call()
    {
        int[] start = new int[2];
        start[0] = 0; start[1] = 0;  // Point[0] represents x-axis and Point[1] represents the y-axis
        path(start);
        System.out.println("\nThere are: "+routes+" routes");
    }

    public void path(int[] point)                                                              // Recursive method that maps every possible route
    {
        int[] temp = new int[2]; temp[0] = point[0]; temp[1] = point[1];
        // System.out.println(temp[0]+" , "+temp[1]);

        if((temp[0] >= gridSize) && (temp[1] >= gridSize))
        {
            // System.out.println("Finished");
            routes++;
        }

        else if(temp[0] >= gridSize)
        {
            temp[1]++;
            // System.out.println("Down at side edge");
            path(temp);
        }

        else if(temp[1] >= gridSize)
        {
            temp[0]++;
            // System.out.println("Right at bottom edge");
            path(temp);
        }

        else if((temp[0] < gridSize) && (temp[1] < gridSize))
        {
            int right[] = new int[2]; right[0] = temp[0]; right[1] = temp[1];
            int down[] = new int[2]; down[0] = temp[0]; down[1] = temp[1];

            right[0]++;
            // System.out.println("Send one to the right");
            path(right);

            // System.out.println(down[0]+" , "+down[1]);

            down[1]++;
            // System.out.println("Send one downwards");
            path(down);

        } else { System.out.println("Error detected");}
    }

*/
}
