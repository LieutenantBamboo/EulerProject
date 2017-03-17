package Interview.String;

import java.util.HashMap;

/**
 * Created by matthewconnorday on 21/12/16.
 *
 * Reasoning: Checking all possible permutations would be in exponential time
 * Therefore: Check if all the letters in either words are the same for linear time
 */
public class Anagram {

    /** Field variables */
    private String word1, word2;
    private HashMap<String, Integer> wordMap1 = new HashMap<>(), wordMap2 = new HashMap<>();

    /** Class constructor */
    public Anagram(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    /* Standard class call method */
    public void call(){
        System.out.println("It is " + anagram() + " that the word '" + word1 + "' is an anagram of '" + word2 + "'");
    }

    /** Will check if string fields are anagrams of one another
     *  @return whether word1 is an anagram of word2
     */
    private boolean anagram(){
        boolean anagram = false;

        if(word1.length() != word2.length()){System.out.println("Words cannot be anagrams, as they are of different lengths");}
        // TODO case sensitive part
        else if(checkCharacters()){anagram = true;}

        return anagram;
    }

    /** @return whether or not the HashMaps of the two words are equal */
    private boolean checkCharacters(){
        boolean same = false; generateMap1(); generateMap2();
        if(wordMap1.equals(wordMap2)){same = true;}
        return same;
    }

    /** Method used to generate the hashmap for word1 */
    private void generateMap1(){
        for(int x = 0; x < word1.length(); x++){
            if(wordMap1.containsKey(word1.substring(x,x+1))){
                wordMap1.replace((word1.substring(x,x+1)),wordMap1.get((word1.substring(x,x+1))));
            }

            else{wordMap1.put(word1.substring(x,x+1),1);}
        }
    }

    /** Method used to generate the hashmap for word2 */
    private void generateMap2(){
        for(int x = 0; x < word2.length(); x++){
            if(wordMap2.containsKey(word2.substring(x,x+1))){
                wordMap2.replace((word2.substring(x,x+1)),wordMap2.get((word2.substring(x,x+1))));
            }
            else{
                wordMap2.put(word2.substring(x,x+1),1);
            }
        }
    }


}
