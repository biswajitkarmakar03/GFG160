class Solution:
    
    def countPairs(self, arr, target):
        
        arr.sort()
        cnt = 0
        left, right = 0, len(arr) - 1
        
        while left < right:
            if arr[left] + arr[right] < target:
                cnt += (right - left)
                left += 1
                
            else:
                right -= 1
                
        return cnt