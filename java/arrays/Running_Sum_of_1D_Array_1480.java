package java.arrays;

public class Running_Sum_of_1D_Array_1480 {
        public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            ans[i]=sum;
            
        }
        return ans;
    }
}
