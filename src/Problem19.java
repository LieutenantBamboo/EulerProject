/**
 * Created by matthewconnorday on 25/03/16.
 */
public class Problem19 {

    // Class vars

    int dayOfWeek = 2, currentDate = 1, currentMonth = 1, currentYear = 1901;
    int[] month = new int[12];


    public void call(){months(); System.out.println("There are: "+domingo()+" Sundays");
    }

    public int domingo()
    {
        int answer = 0;
        boolean vamosA = true;

        while(vamosA)
        {
            //System.out.println("day = " + currentDate + " month = " + currentMonth + ", year = " + currentYear);
            if((currentDate == 1) && (dayOfWeek == 7)){answer++;
                System.out.println("Sunday found: month = " + currentMonth + ", year = " + currentYear);}

            if(dayOfWeek==7){dayOfWeek = 0;}

            if(currentDate >= month[currentMonth-1]){currentDate = 0; currentMonth++;}

            if(currentMonth > month.length)
            {
                currentMonth = 1; currentYear++;
                if((currentYear%4)==0){month[1] = 29;}
                else{month[1] = 28;}
            }

            currentDate++;
            dayOfWeek++;

            if(currentYear>=2001){vamosA = false;}
        }

        return answer;
    }

    public void months()
    {
        month[0] = 31; month[1] = 28;
        month[2] = 31; month[3] = 30;
        month[4] = 31; month[5] = 30;
        month[6] = 31; month[7] = 31;
        month[8] = 30; month[9] = 31;
        month[10] = 30; month[11] = 31;



    }
}

/* Unnecessary code

public void months()
    {
        for(int x = 0; x < 7; x++)
        {
            if((x%2)==0){month[x] = 31;}
            else{month[x] = 30;}
            System.out.println("Month " + (x+1) + " has " + month[x] + " days");
        }
        for(int y = 7; y < 12; y++)
        {
            if((y%2)==0){month[y] = 30;}
            else{month[y] = 31;}
            System.out.println("Month " + (y+1) + " has " + month[y] + " days");
        }
        month[1] = 28;

    }

 */
