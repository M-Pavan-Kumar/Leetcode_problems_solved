class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        s_map={}
        t_map={}
        for ch_s,ch_t in zip(s,t):
            if ch_s not in s_map:
                if ch_t in t_map:
                    return False
                s_map[ch_s]=ch_t
                t_map[ch_t]=ch_s
            else:
                if s_map[ch_s]!=ch_t:
                    return False
        return True