package java.arrays;

public class Shuffle_the_Array_1470 {

    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[2*n];
        for(int i=0;i<n;i++){
            res[2*i]=nums[i];
            res[2*i+1]=nums[n+i];
        }
        return res;
        // List<Integer> res=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     res.add(nums[i]);
        //     res.add(nums[n+i]);
        // }
        // int[] ress=new int[2*n];
        // for(int i=0;i<res.size();i++){
        //     ress[i]=res.get(i);
        // } 
        // return ress;
    }
}