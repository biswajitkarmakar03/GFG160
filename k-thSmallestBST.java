class Solution {
    public int kthSmallest(Node root, int k) {
        Deque<Node> stack = new ArrayDeque<>();
        Node curr = root;
        int count = 0;
        
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            count++;
            if(count == k)
                break;
            curr = curr.right;
        }
        return (k == count) ? curr.data : -1;
    }
}
