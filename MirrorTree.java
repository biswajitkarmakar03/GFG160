class Solution {
    Node helper(Node root){
        if(root == null) return root;
        Node left = helper(root.left);
        Node right = helper(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    
    void mirror(Node node) {
        helper(node);    
    }
}
