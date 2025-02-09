class Solution {
    
    int res = 0;
    int height(Node root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        res = Math.max(res, lh + rh + 1);
        return Math.max(lh, rh) + 1;
    }
    int diameter(Node root) {
        height(root);
        return res - 1;
    }
}
