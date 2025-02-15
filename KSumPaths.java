class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    int count = 0;
    void helper(Node root, int k, int sum){
        if(root == null) return;
        sum += root.data;
        if(map.containsKey(sum - k))
            count += map.get(sum - k);
        map.put(sum, map.getOrDefault(sum,0) + 1);
        helper(root.left,k,sum);
        helper(root.right,k,sum);
        if(map.get(sum) > 1)
            map.put(sum, map.get(sum)-1);
        else map.remove(sum);
        sum -= root.data;
    }
    public int sumK(Node root, int k) {
        map.put(0,1);
        helper(root,k,0);
        return count;
    }
}
