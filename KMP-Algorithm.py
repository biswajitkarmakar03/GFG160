def constructLps(pat):
    m = len(pat)
    lps = [0] * m
    len_ = 0 
    
    for i in range(1, m):
        if pat[i] == pat[len_]:
            len_ += 1
            lps[i] = len_
        else:
            if len_ != 0:
                len_ = lps[len_ - 1]
                i -= 1  
            else:
                lps[i] = 0
    return lps

class Solution:
    def search(self, pat, txt):
        m = len(pat)
        n = len(txt)
        
        lps = constructLps(pat)
        res = []
        
        i = 0  
        j = 0  
        
        while i < n:
            if txt[i] == pat[j]:
                i += 1
                j += 1

            if j == m:  
                res.append(i - j)
                j = lps[j - 1]

            elif i < n and txt[i] != pat[j]:
                if j != 0:
                    j = lps[j - 1]
                else:
                    i += 1
        return res
