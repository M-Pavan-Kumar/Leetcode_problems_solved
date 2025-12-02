class Solution:
    def defangIPaddr(self, address: str) -> str:
        res=[]
        for chr in address:
            if chr==".":
                res.append("[.]")
            else:
                res.append(chr)
        return "".join(res)