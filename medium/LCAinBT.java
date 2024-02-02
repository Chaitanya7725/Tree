package medium;

import com.sun.source.tree.Tree;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1() {}

    TreeNode1(int val) {
        this.val = val;
    }
    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class LCAinBT {

    public static void main(String[] args) {
        TreeNode1 left = new TreeNode1(5);
        TreeNode1 right = new TreeNode1(1);
        TreeNode1 root = new TreeNode1(3, left, right);
        left.left = new TreeNode1(6);
        left.right = new TreeNode1(2, new TreeNode1(7), new TreeNode1(4));
        right.left = new TreeNode1(9);
        right.right = new TreeNode1(8);

        TreeNode1 p = new TreeNode1(5);
        TreeNode1 q = new TreeNode1(4);
        System.out.println(lowestCommonAncestor(root, p, q).val);
    }

    public static TreeNode1 lowestCommonAncestor(TreeNode1 root,TreeNode1 p, TreeNode1 q) {
        if (root ==null) return null;
        if (root.val == p.val || root.val == q.val) return root;
        TreeNode1 left = lowestCommonAncestor(root.left, p, q);
        TreeNode1 right = lowestCommonAncestor(root.right, p, q);

        if(left != null &&  right != null) return root;
        return left != null? left: right;
    }

}