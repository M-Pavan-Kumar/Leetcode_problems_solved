package java.strings;

public class Jewels_and_stones_771 {
     public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++){
            char current_stone=stones.charAt(i);
            for(int j=0;j<jewels.length();j++){
                char current_jewel=jewels.charAt(j);
                if(current_stone==current_jewel){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
