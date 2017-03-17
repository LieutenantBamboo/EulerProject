package Interview.String;

/**
 * Created by matthewconnorday on 16/12/16.
 */
public class Palindrome {

    public static void main(String[] args) {
        Palindrome pal = new Palindrome("Anacocana");
        pal.call();
    }

    /** Field Variables */
    private String word;

    /** Constructor */
    public Palindrome(String word){this.word = word.toLowerCase();}

    /** Standard class call method */
    public void call(){
        System.out.println("It is " + isPalidrome(word) + " that the word " + word + " is a palindrome");
    }

    /** Checks whether or not a word is a palindrome
     *  @param word - The word to be checked
     *  @return boolean of whether or not the input string is a palindrome
     */

    private boolean isPalidrome(String word){
        boolean is = false;
        int botHalf = word.length()/2, topHalf = botHalf;

        if((word.length()%2) != 0){topHalf++;}

        String firstHalf = word.substring(0,botHalf);
        String secondHalf = new StringBuffer(word.substring(topHalf,word.length())).reverse().toString();

        if(firstHalf.equals(secondHalf)){is = true;}

        return is;
    }
}
