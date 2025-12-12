class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        freq={}
        for num in nums:
            freq[num]=freq.get(num,0)+1
        sum=0
        for key,value in freq.items():
            if value==1:
                sum+=key
        return sum