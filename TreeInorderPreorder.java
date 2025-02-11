class Solution {
    int preIndex = 0;
    Node build(int[] in, int[] pre, int start, int end){
        if(start > end)
            return null;
        Node root = new Node(pre[preIndex++]);
        int index = 0;
        for(int i = start; i <= end; i++){
            if(in[i] == root.data){
                index = i;
                break;
            }
        }
        root.left = build(in, pre, start, index-1);
        root.right = build(in, pre, index+1, end);
        return root;
    }
    public Node buildTree(int inorder[], int preorder[]){
        int n = inorder.length;
        return build(inorder, preorder, 0, n-1);
    }
}
