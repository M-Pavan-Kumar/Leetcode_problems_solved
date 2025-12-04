package java.strings;

public class Reverse_Prefix_of_Word_2000 {
        public String reversePrefix(String word, char ch) {

       int index=word.indexOf(ch);
       if(index==-1){
        return word;
       }
       String prefix=word.substring(0,index+1);
       String suffix=word.substring(index+1,word.length());
       StringBuilder reversed=new StringBuilder(prefix);
       reversed.reverse();

        return reversed.toString()+suffix;
    }
}
