package java.strings;

public class Number_of_Strings_That_Appear_as_Substrings_in_Word {
     public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String pattern:patterns){
            if(word.contains(pattern)){
                c++;
            }
        }
        return c;
    }
}
