package java.strings;

public class Find_the_Index_of_the_First_Occurrence_in_a_String_28 {
     public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle);
        
        //or

        int h_len=haystack.length();
        int n_len=needle.length();
        if (h_len<n_len){
            return -1;
        }
        for(int i=0;i<=h_len-n_len;i++){
            String sub=haystack.substring(i,i+n_len);
            if (sub.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
