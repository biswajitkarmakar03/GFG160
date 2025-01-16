class Solution:
  
    def findEquilibrium(self, arr):
        
        prefSum = 0
        total = sum(arr)
        
        for pivot in range(len(arr)):
            suffSum = total - prefSum - arr[pivot]
            
            if prefSum == suffSum:
                return pivot
            prefSum += arr[pivot]
            
        return -1
