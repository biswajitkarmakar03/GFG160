def computeLPSArray(pat):
    n = len(pat)
    lps = [0] * n
    patLen = 0
    i = 1

    while i < n:
        if pat[i] == pat[patLen]:
            patLen += 1
            lps[i] = patLen
            i += 1
        else:
            if patLen != 0:
                patLen = lps[patLen - 1]
            else:
                lps[i] = 0
                i += 1

    return lps

class Solution:
    def areRotations(self, s1, s2):
        if len(s1) != len(s2):
            return False
        
        # Concatenate s1 with itself and check if s2 is a substring
        txt = s1 + s1
        pat = s2

        n = len(txt)
        m = len(pat)

        lps = computeLPSArray(pat)
        i = 0
        j = 0

        while i < n:
            if pat[j] == txt[i]:
                j += 1
                i += 1

            if j == m:
                return True

            elif i < n and pat[j] != txt[i]:
                if j != 0:
                    j = lps[j - 1]
                else:
                    i += 1

        return False