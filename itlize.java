import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

// The words in paragraph are case-insensitive and the answer should be returned in lowercase.
public class itlize {
    public itlize(){

    }
        public String mostCommonWord(String paragraph, String[] bannedWords) {

            // replace all punctuations with spaces, put all letters to lower case, split the string intos words
            String newParagraph = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
            String[] words = newParagraph.split("\\s+");
            
            // ensure there's no duplicates in String [] bannedWords
            Set<String> setOfBannedWords = new HashSet<>();
            Collections.addAll(setOfBannedWords, bannedWords);
            
            // count the appearance of each word, except the banned words
            Map<String,Integer> wordCount = new HashMap<>();
            for(String word : words){
                if(!setOfBannedWords.contains(word)){
                    wordCount.put(word, wordCount.getOrDefault(word,0) + 1);
                }
            }
            return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        }
    
    public static void main (String [] args){
        itlize i = new itlize();
        String [] lstofBannedWords = {"apple","ant"};
        String paragraph = "An apple ate an ant. Not sure why, but that's weird. Weird huh?";

        System.out.println(i.mostCommonWord(paragraph, lstofBannedWords));

    }
}

