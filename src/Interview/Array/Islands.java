package Interview.Array;

/**
 * Created by matthewconnorday on 14/12/16.
 */
public class Islands {

    int[][] array, foobar;

    public Islands(int[][] array){
        this.array = array;
        foobar = new int[array.length][array.length];
    }

    public void call(){
        System.out.println("There are " + islandFinder() + " islands");}

    public int islandFinder(){
        int occurrences = 0;

        for(int x = 0; x < array.length; x++){
            for(int y = 0; y < array.length; y++){
                if((array[x][y] == 1) && (foobar[x][y] != 1)){occurrences++;
                    System.out.println(islandSize(x,y));}
            }
        }
        return occurrences;
    }

    public int islandSize(int x,int y) {
        int size = 0;

        foobar[x][y] = 1;
        size++;

        // x-demension nearby cell check
        if(x != array.length-1) {
            if ((array[x + 1][y] == 1) && (foobar[x + 1][y] != 1)) {
                size += islandSize(x + 1, y);
            }
        }
        if(x != 0){
            if ((array[x - 1][y] == 1) && (foobar[x - 1][y] != 1)) {
                size += islandSize(x - 1, y);
            }
        }

        // y-demension nearby cell check
        if(y != array.length-1) {
            if ((array[x][y + 1] == 1) && (foobar[x][y + 1] != 1)) {
                size += islandSize(x, y + 1);
            }
        }
        if(y != 0){
            if ((array[x][y - 1] == 1) && (foobar[x][y - 1] != 1)) {
                size += islandSize(x, y - 1);
            }
        }
        return size;
    }
}
