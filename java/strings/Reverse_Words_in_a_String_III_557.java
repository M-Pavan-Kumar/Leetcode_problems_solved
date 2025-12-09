package java.strings;

public class Reverse_Words_in_a_String_III_557 {
        public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.length;i++){
           String reversed_word=new StringBuilder(words[i]).reverse().toString();
           res.append(reversed_word);
           if(i<words.length-1){
            res.append(" ");
           }
        }
        return res.toString();
    }
}
