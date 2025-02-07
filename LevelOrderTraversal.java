class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue <Node> queue = new LinkedList<>();
        if(root == null) return ans;
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            int count = queue.size();
            ans.add(new ArrayList<>());
            ArrayList<Integer> level = new ArrayList<>();
            
            for(int i = 0; i < count; i++){
                Node curr = queue.poll();
                level.add(curr.data);
                if(curr.left != null)
                    queue.offer(curr.left);
                if(curr.right != null)
                    queue.offer(curr.right);
            }
            ans.add(level);
        }
        return ans;
    }
}
