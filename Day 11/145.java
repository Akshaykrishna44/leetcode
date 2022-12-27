class Solution {
    List <Integer> l=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)return l;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        l.add(root.val);
        return l;
    }
}
