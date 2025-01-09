import sys

class Solution:
    def sumClosest(self, arr, target):
        arr.sort()
        
        n = len(arr)
        left, right = 0, n - 1
        minDiff = sys.maxsize
        res = []
        
        while left < right:
                
            currSum = arr[left] + arr[right]
            currDiff = abs(currSum - target)
                
            if currDiff < minDiff:
                minDiff = currDiff
                res = [arr[left], arr[right]]
                    
            elif currDiff == minDiff:
                if (arr[right] - arr[left]) > (res[1] - res[0]):
                    res = [arr[left], arr[right]]
            
            if currSum < target:
                left += 1
            else:
                right -= 1
            
        return res       
