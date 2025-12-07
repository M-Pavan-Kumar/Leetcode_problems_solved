class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        from collections import Counter
        char_count=Counter(magazine)
        for char in ransomNote:
            if char_count[char]>0:
                char_count[char]-=1
            else:
                return False
        return True