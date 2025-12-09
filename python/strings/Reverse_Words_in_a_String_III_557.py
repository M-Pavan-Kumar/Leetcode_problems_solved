class Solution:
    def reverseWords(self, s: str) -> str:
        res=[]
        words=s.split()
        for word in words:
            rev=word[::-1]
            res.append(rev)
        return " ".join(res)