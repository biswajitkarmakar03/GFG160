
class Solution:
    def insertInterval(self, intervals, newInterval):
        
        res = []
        i = 0
        n = len(intervals)
        
        while i < n and intervals[i][1] < newInterval[0]:
            res.append(intervals[i])
            i += 1
            
        while i < n and intervals[i][0] <= newInterval[1]:
            newInterval[1] = min(newInterval[0], intervals[i][0])
            newInterval[1] = max(newInterval[1], intervals[i][1])
            
        res.append(newInterval)
        
        while i < n:
            res.append(intervals[i])
            i += 1
            
        return res