class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        cnt=0
        pref_length=len(pref)
        for word in words:
            if word[:pref_length]==pref:
                cnt+=1
        return cnt