class Solution {
    public static Node reverse(Node head, Stack<Node> st, int k) {
        Node curr = head;
        Node temp = null;
        
        while(curr != null){
            int count = 0;
            while(curr != null && count < k){
                st.push(curr);
                curr = curr.next;
                count++;
            }
            while(!st.isEmpty()){
                if(temp != null){
                    temp.next = st.pop();
                    temp = temp.next;
                }
                else if(temp == null){
                    temp = st.pop();
                    head = temp;
                }
            }
        }
        temp.next = null;
        return head;
    }
    public static Node reverseKGroup(Node head, int k){
        if(head == null && k == 1)return head;
        Stack<Node> st = new Stack<>();
        Node t = reverse(head, st, k);
        return t;
    }
}
