class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        i=0
        for char in word:
            if char==ch:
                prefix=word[:i+1]
                suffix=word[i+1:]
                rev_prefix=prefix[::-1]
                return rev_prefix+suffix
            else:
                i+=1
        return word
            
