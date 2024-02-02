package medium;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class LCAinBST {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        System.out.println(lowestCommonAncestor(root, new TreeNode(3), new TreeNode(5)).val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }

}
