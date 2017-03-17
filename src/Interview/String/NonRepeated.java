package Interview.String;

import java.util.HashMap;

/** Class to find the first non-repeated character in a String
 *  Created by matthewconnorday on 16/12/16.
 */
public class NonRepeated {

    public static void main(String[] args) {
        NonRepeated nR = new NonRepeated("Hello");
        nR.call();
    }

    /** Field variables */
    private HashMap<String, int[]> characters;
    private String word;

    /** Constructor */
    public NonRepeated(String word){
        this.word = word;
        characters = new HashMap<>();
    }

    /** Standard class call method */
    public void call(){
        System.out.println("Found it: " + non(word));
    }

    /** Generates the HashMap of the word
     *  If (the key is present in the hashmap): take the value and add one (one extra character occurrence)
     *  else : add the key to the hashmap with one occurrence
     *  @return the first non repeated character
     */

    private String non(String word) throws NullPointerException{

        for(int x = 0; x < word.length(); x++){
            String cur = word.substring(x,x+1);

            if(characters.containsKey(cur)){
                int[] array = characters.get(cur);
                array[1]++;
                characters.replace(cur, array);
            }
            else{characters.put(cur, new int[] {x,1});}
        }

        return hashSearch();
    }

    /** Iterate (in order, hopefully) through each character added
     *  to the HashMap until there is one that only occurs once
     *  @return the first key in the string that has a single occurence
     */
    private String hashSearch(){

        String result = "";
        int resultPos = word.length();

        /* Loop through the HashMap and find the character with the smallest order and single count */
        for (String key : characters.keySet()){
            if((characters.get(key)[1] == 1) && (characters.get(key)[0] < resultPos)) {
                result = key;
                resultPos = characters.get(result)[0];
            }
        }

        return result;
    }
}
