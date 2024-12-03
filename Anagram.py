class Solution:
    
     def areAnagrams(self, s1, s2):
        
        charCount = {}
        
        for ch in s1:
            charCount[ch] = charCount.get(ch, 0) + 1
            
        for ch in s2:
            charCount[ch] = charCount.get(ch, 0) - 1
            
        for value in charCount.values():
            if value != 0:
                return False
                
        return True