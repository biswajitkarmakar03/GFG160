class Solution:    
   
	def findUnion(self, a, b):
        st = set()
        
        for i in range(len(a)):
            st.add(a[i])
            
        for i in range(len(b)):
            st.add(b[i])
            
        res = []
        
        for it in st:
            res.append(it)
    
        return len(res)
