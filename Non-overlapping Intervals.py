
class Solution:
    def minRemoval(self, intervals):
        
        cnt = 0
        intervals.sort(key = lambda x: x[0])
        
        end = intervals[0][1]
        for i in range(1, len(intervals)):
            
            if intervals[i][0] < end:
                cnt += 1
                end = min(intervals[i][1], end)
                
            else:
                end = intervals[i][1]
                
        return cnt