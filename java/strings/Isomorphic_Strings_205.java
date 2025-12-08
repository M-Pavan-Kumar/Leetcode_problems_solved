package java.strings;

import java.util.HashMap;

public class Isomorphic_Strings_205 {
        public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original=s.charAt(i);
            char replacement=t.charAt(i);
            if(!map.containsKey(original)){
                if(!map.containsValue(replacement)){
                    map.put(original,replacement);
                }
                else{
                    return false;
                    }
            }else{
                char mapped_char=map.get(original);
                if(mapped_char!=replacement){
                    return false;
                }
            }
            
        }
        return true;
    }
}
