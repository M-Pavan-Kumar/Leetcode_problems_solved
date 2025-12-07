package java.strings;

import java.util.HashSet;
import java.util.Set;

public class Count_the_Number_of_Consistent_Strings_1684 {
        public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowed_char=new HashSet<Character>();
        for (char c:allowed.toCharArray()){
            allowed_char.add(c);
        }
        int c=0;
        for(String word: words){
           boolean is_consistent=true;
            for(char ch:word.toCharArray()){
                if(!allowed_char.contains(ch)){
                    is_consistent=false;
                    break;
                }
            }
            if(is_consistent){
                c++;
            }
        }
        return c;

    }
}
