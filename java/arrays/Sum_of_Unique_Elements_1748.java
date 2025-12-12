package java.arrays;

import java.util.HashMap;
import java.util.Map;

public class Sum_of_Unique_Elements_1748 {
        public int sumOfUnique(int[] nums) {
     Map<Integer,Integer> freq=new HashMap<>();
     for (int num:nums){
        freq.put(num,freq.getOrDefault(num,0)+1);
     }
     int sum=0;
     for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
        int key=entry.getKey();
        int count=entry.getValue();
        if (count==1){
            sum+=key;
        }
     }
     return sum;
    }
}
