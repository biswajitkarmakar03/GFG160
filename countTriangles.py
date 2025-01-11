from bisect import bisect_left

class Solution:
    
    def countTriangles(self, arr):
        
        res = 0
        arr.sort()
        
        for i in range(len(arr)):
            for j in range(i + 1, len(arr)):
                
                k = bisect_left(arr, arr[i] + arr[j], j + 1)
                
                cnt = k - j - 1
                res += cnt
                        
        return res
