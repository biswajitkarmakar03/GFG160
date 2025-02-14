class Solution {
    int maxSum = Integer.MIN_VALUE;
    int currSum = Integer.MIN_VALUE;
    
    int findMax(Node root) {
        if(root == null) return 0;
        
        int ls = findMax(root.left);
        int rs = findMax(root.right);
        
        maxSum = Math.max(maxSum, Math.max(currSum, root.data + ls + rs));
        currSum = Math.max(root.data, Math.max(ls,rs) + root.data);
        return currSum;
    }
    int findMaxSum(Node root){
        return Math.max(findMax(root), maxSum);
    }
}
