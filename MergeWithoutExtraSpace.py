class Solution:
    def mergeArrays(self, a, b):
        n = len(a)
        m = len(b)
        gap = (n + m + 1) // 2
        
        while gap > 0:
            i = 0
            j = gap
            
            while j < n + m:
                if j < n and a[i] > a[j]:
                    a[i], a[j] = a[j], a[i]
                    
                elif i < n and j >= n and a[i] > b[j - n]:
                    a[i], b[j - n] = b[j - n], a[i]
                    
                elif i >= n and b[i - n] > b[j - n]:
                    b[i - n], b[j - n] = b[j - n], b[i - n]
                    
                i += 1
                j += 1
                
            if gap == 1:
                break
            
            gap = (gap + 1) // 2