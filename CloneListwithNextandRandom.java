class Solution {
    public Node cloneLinkedList(Node head) {
        if(head == null) return null;
        
        for(Node curr = head; curr != null; curr = curr.next.next){
            Node clone = new Node(curr.data);
            clone.next = curr.next;
            curr.next = clone;
        }
        
        for(Node curr = head; curr != null; curr = curr.next.next){
            if(curr.random != null){
                curr.next.random =  curr.random.next;
            }
        }    
        
        Node cloneHead = head.next;
        for(Node curr = head; curr != null;){
            Node clone = curr.next;
            curr.next = clone.next;
            curr = curr.next;
            if(curr != null){
                clone.next = curr.next;
            }
        }
        
        return cloneHead;
    
    }
}
