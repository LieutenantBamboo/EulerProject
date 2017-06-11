import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Problem: Efficiently find (non-brute-force) the highest sum of linked numbers in a triangle
 * <p>
 * Solution: Calculate the maxVal sequentially down from the top as the sum of the number itself
 * and the largest value of either its left or right parent
 * <p>
 * Efficiency: Big O(n^2)
 */

public class Problem18 {
    // Change length of node summation (sum 3, take max and find max from that last node of that max summation)
    //private Problem18Tree tree;
    private int maxLineLength;
    private int[][] triangle;
    private int[][] max;

    // Input data (easy to read / interpret)
    private String input;

    /**
     * Expected constructor
     */
    public Problem18(File file) throws FileNotFoundException {
        try {
            maxLineLength = 0;
            //tree = new Problem18Tree();
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                input += scan.nextLine();
                maxLineLength++;
            }
            max = new int[maxLineLength][maxLineLength];
            triangle = new int[maxLineLength][maxLineLength];
            System.out.println("Max line length is: " + maxLineLength);
        } catch (FileNotFoundException e) {
            System.err.print(e);
        }
    }

    /**
     * Default constructor
     */
    public Problem18() {
        input =
                "75 " +
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
        maxLineLength = 15;
        max = new int[maxLineLength][maxLineLength];
        triangle = new int[maxLineLength][maxLineLength];
    }

    /**
     *
     */
    public void call() {
        store();
        searchArray();
        System.out.println(findAnswer());
    }

    /**
     * Stores the input string as a 2-dimensional array
     */
    private void store() {
        int num = 0;
        int length = 1;
        while (length <= maxLineLength) {
            for (int x = 0; x < length; x++) {
                triangle[length - 1][x] = Integer.valueOf(input.substring(num, num + 2));
                num += 3;
            }
            length++;
        }
    }

    /**
     * Method to dynamically search through the array and set the max path sum for each element
     * <p>
     * Four possible parents:
     * 1) element on far left of row, parent on top right (index - line.length + 1)
     * 2) element on far right of row, parent on top left (index - line.length)
     * 3) element in between two other elements, accesses both parents
     * 4) element is a root, no parents, max calculated as only itself
     * </p>
     */
    private void searchArray() {
        int length = 1;
        while (length <= maxLineLength) {
            for (int x = 0; x < length; x++) {
                if (length != 1) {
                    if (x == 0) {
                        max[length - 1][x] = triangle[length - 1][x] + max[length - 2][x];
                    } else if (x == (length - 1)) {
                        max[length - 1][x] = triangle[length - 1][x] + max[length - 2][x - 1];
                    } else {
                        // Max val = value + Math.max( top left parent , top right parent );
                        max[length - 1][x] = triangle[length - 1][x] + Math.max(max[length - 2][x - 1], max[length - 2][x]);
                    }
                } else {
                    max[length - 1][x] = triangle[length - 1][x];
                }
            }
            length++;
        }
    }


    /**
     * Finds the maximum value in the bottom row, representing the maximum possible combination
     *
     * @return the max value
     */
    private int findAnswer() {
        int maxAns = 0;
        // Loop through last line of the array
        for (int i = 0; i < maxLineLength; i++) {
            if (max[maxLineLength - 1][i] > maxAns) {
                maxAns = max[maxLineLength - 1][i];
            }
        }
        return maxAns;
    }

    public static void main(String[] args) {
        Problem18 problem = new Problem18();
        problem.call();
    }
}
/*
class Problem18Tree {
    Problem18Node root;

    public Problem18Tree() {
    }
}


class Problem18Node {

    Problem18Node parentLeft, parentRight, childLeft, childRight;
    int maxVal;

    public Problem18Node() {
        maxVal = 0;
    }

}
/*
// Code Archival

/*
    Possible tree / node implementation:
    /**
     * Uses the two-demensional array read in from the text file to crate
     * a new tree with each element representing a node
     */
/*
private void createTree() {
    for (int i = 0; i < maxLineLength; i++) {
        for(int j = 0; j < triangle.length; j++) {
            if () {
            } else if () {
            } else {
            }
        }
    }
}

    private void searchTree() {
        // Set the initial node as the root node
        Problem18Node node = tree.root;

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle.length; j++) {

            }
        }
    }
 */



/*

    public void triangleNumbers()                                                        // Node creator using triangle numbers
    {
        int sum = 0;

        for (int x = 1; x < maxLineLength; x++)                                             // For each row of the triangle
        {
            sum += x;
        }

        System.out.println("Sum of numbers is equal to: " + sum);
    }

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