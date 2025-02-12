class Solution {
    static void in(Node root, ArrayList<Integer> ans){
        if(root != null){
            in(root.left, ans);
            ans.add(root.data);
            in(root.right, ans);
        }
    }
    
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        in(root, ans);
        return ans;
    }
}
