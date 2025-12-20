package java.arrays;

public class Create_TargetArray_in_the_Given_Order_1389 {
        public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}
