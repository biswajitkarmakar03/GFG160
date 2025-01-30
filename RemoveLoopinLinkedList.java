class Solution {
    public static void removeLoop(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        if(slow != fast) return;
        
        slow = head;
        if(slow == fast){
            while(fast.next != slow){
                fast = fast.next;
            }
        }else{
            while(fast.next != slow.next){
                slow = slow.next;
                fast = fast.next;
            }
        }
        fast.next = null;
    }
}
