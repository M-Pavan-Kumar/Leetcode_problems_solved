class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        s_lst=list(s)
        left=0
        right=len(s)-1
        while left<right:
            if not s_lst[left].isalpha():
                left+=1
                continue
            if not s_lst[right].isalpha():
                right-=1
                continue
            s_lst[left],s_lst[right]=s_lst[right],s_lst[left]
            left+=1
            right-=1
        return "".join(s_lst)
