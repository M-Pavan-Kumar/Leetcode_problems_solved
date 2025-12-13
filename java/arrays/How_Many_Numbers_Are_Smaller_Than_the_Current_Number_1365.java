package java.arrays;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number_1365 {
        public int[] smallerNumbersThanCurrent(int[] nums) {
    //  int[] res=new int[nums.length];
    //  for(int i=0;i<nums.length;i++){
    //    int curr_sum=0;
    //     for(int j=0;j<nums.length;j++){
    //         if (nums[i]>nums[j]){
    //             curr_sum++;
    //         }
    //     }
    //     res[i]=curr_sum;
    //  } 
    //  return res;  


// or

    int max=101;
    int[] freq_cnt=new int[max];
    for(int num : nums){
        freq_cnt[num]+=1;

    }
    for(int i=1;i<max;i++){
        freq_cnt[i]+=freq_cnt[i-1];
    }
    int[] res=new int[nums.length];
    for (int i=0;i<nums.length;i++){
        if (nums[i]==0){
            res[i]=0;
        }
        else{
            res[i]=freq_cnt[nums[i]-1];
        }
    }
    return res;
    }
}
