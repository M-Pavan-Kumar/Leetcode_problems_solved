package java.strings;

import java.util.HashMap;

public class Ransom_Note_383 {

        public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(Character c :magazine.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(Character ch:ransomNote.toCharArray()){
            if (!map.containsKey(ch) || map.get(ch)==0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
           
        }
 return true;
    }
}