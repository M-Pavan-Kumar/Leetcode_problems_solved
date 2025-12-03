package java.strings;

public class Truncate_Sentence_1816 {
    public String truncateSentence(String s, int k) {
        String[] words=s.split(" ");
        StringBuilder res=new StringBuilder();
        for (int i=0;i<k;i++){
            res.append(words[i]);
            if(i<k-1){
                res.append(" ");
            }
        }
        return res.toString();
    }
}
