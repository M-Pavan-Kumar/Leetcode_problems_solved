class Solution:
    def countAsterisks(self, s: str) -> int:
        bar=0
        count=0
        for char in s:
            if char=="|":
                bar+=1
            if bar%2==0 and char=="*":
                count+=1
        return count
