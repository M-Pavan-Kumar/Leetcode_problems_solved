package java.arrays;

import java.util.ArrayList;
import java.util.List;

public class Decompress_Run_Length_Encoded_List_1313 {

    class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i+=2){
            int freq=nums[i];
            int value=nums[i+1];
            for(int j=0;j<freq;j++){
                ans.add(value);
            }
        }
        int[] res=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            res[k]=ans.get(k);
        }
        return res;
    }
}
}