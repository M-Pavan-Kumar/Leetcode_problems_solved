class Solution:
    def sortSentence(self, s: str) -> str:
        words=s.split()
        res=[None]*len(words)
    
        for word in words:
            index=int(word[-1])
            correct_pos=index-1
            res[correct_pos]=word[:-1]
        return " ".join(res)
