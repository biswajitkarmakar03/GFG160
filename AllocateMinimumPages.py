def check(arr, k, pageLimit):
    
    cnt = 1
    pageSum = 0
    
    for pages in arr:
        
        if pageSum + pages > pageLimit:
            cnt += 1
            pageSum = pages
        else:
            pageSum += pages
            
    return cnt <= k

class Solution:
    
    def findPages(self, arr, k):
        
        if k > len(arr):
            return -1
            
        lo = max(arr)
        hi = sum(arr)
        res = -1
        
        while lo <= hi:
            mid = lo +(hi - lo) // 2
            
            if check(arr, k, mid):
                res = mid
                hi = mid - 1
            else:
                lo = mid + 1
                
        return res