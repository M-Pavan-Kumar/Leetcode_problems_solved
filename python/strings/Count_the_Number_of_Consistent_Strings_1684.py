class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        c=0
        allowed_chars=set(allowed)
        for word in words:
            is_consistent=True
            for char in word:
                if char not in allowed_chars:
                    is_consistent=False
                    break
            if is_consistent:
                c+=1
        return c