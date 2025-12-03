class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        res=[]
        i=1
        words=s.split()
        for word in words:
            if i<=k:
                res.append(word)
            i+=1
        return " ".join(res)