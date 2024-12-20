def check(stalls, k, dist):
    
    cnt = 1
    prev = stalls[0]
    
    for i in range(1, len(stalls)):
        if stalls[i] - prev >= dist:
            prev = stalls[i]
            cnt += 1
            
    return cnt >= k

class Solution:

    def aggressiveCows(self, stalls, k):
    
        stalls.sort()
        res = 0
        
        lo = 1
        hi = stalls[-1] - stalls[0]
        
        while lo <= hi:
            mid = lo + (hi - lo) // 2
            
            if check(stalls, k, mid):
                res = mid
                lo = mid + 1
            else:
                hi = mid - 1
                
        return res