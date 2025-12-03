package java.strings;

public class Sorting_the_Sentence_1859 {
     public String sortSentence(String s) {
        String[] words=s.split(" ");
        String[] res=new String[words.length]; 
        for (String word : words){
            int index=word.charAt(word.length()-1)-'0';
            int correct_index=index-1;
            String actual_word=word.substring(0,word.length()-1);
            res[correct_index]=actual_word;
        }
        return String.join(" ",res);

    }
}
