class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Solution:
    def reverseList(self, head):
        stack = []
        temp = head
         
        while temp is not None:
            stack.append(temp)
            temp = temp.next
             
        if stack:
            head = stack.pop()
            temp = head
        
        while stack:
            
            temp.next = stack.pop()
            
            temp = temp.next
            
        temp.next = None
        
        return head
        
def printList(node):
    while node is not None:
        print(f" {node.data}", end="")
        node = node.next
        
    print("None")
    
head = Node(1)
head.next = Node(2)
head.next.next = Node(3)
head.next.next.next = Node(4)
head.next.next.next.next = Node(5)

solution = Solution()
head = solution.reverseList(head)

