class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        # res=[0]*len(nums)
        # for i in range(len(nums)):
        #     curr_count=0
        #     for j in range(len(nums)):
        #         if nums[i]>nums[j]:
        #             curr_count+=1
        #     res[i]=curr_count
        # return res

# or

        max_val=101
        count_freq=[0]*max_val
        for num in nums:
            count_freq[num]+=1
        for i in range(1,max_val):
            count_freq[i]+=count_freq[i-1]
        res=[]
        for num in nums:
            if num==0:
                res.append(0)
            else:
                res.append(count_freq[num-1])
        return res