class Node:
    def __init__(self, val):
        self.data = val
        self.next = None
        
def reverse(head):
    prev = None
    curr = head
        
    while curr is not None:
        nextNode = curr.next
        curr.next = prev
        prev = curr
        curr = nextNode
            
    return prev
        
def trimLeadingZeros(head):
    while head and head.data == 0:
        head = head.next
    return head
    
def countNodes(head):
    length = 0
    curr = head
    
    while curr is not None:
        length += 1
        curr = curr.next
    
    return length

class Solution:
    
    def addTwoLists(self, num1, num2):
        
        num1 = trimLeadingZeros(num1)
        num2 = trimLeadingZeros(num2)
        
        num1 = reverse(num1)
        num2 = reverse(num2)
            
        carry = 0
        dummy = Node(0)
        res = dummy
        
        
        while num1 is not None or num2 is not None or carry != 0:
            sum_val= carry
            
            if num1 is not None:
                sum_val += num1.data
                num1 = num1.next
                
            if num2 is not None:
                sum_val += num2.data
                num2 = num2.next
                
            carry = sum_val // 10
            res.next = Node(sum_val % 10)
            res = res.next
            
        return reverse(dummy.next)
          
        
def printList(head):
    curr = head
    while curr is not None:
        print(curr.data, end=" ")
        curr = curr.next
    print()
