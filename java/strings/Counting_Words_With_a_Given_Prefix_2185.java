package java.strings;

public class Counting_Words_With_a_Given_Prefix_2185 {
     public int prefixCount(String[] words, String pref) {
        int count=0;
        for (String word:words){
            if (word.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}

