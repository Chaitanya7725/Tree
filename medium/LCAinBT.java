package medium;

import com.sun.source.tree.Tree;

public class LCAinBT {

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
        System.out.println(lowestCommonAncestor(root, new TreeNode(5), new TreeNode(4)));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root,TreeNode p, TreeNode q) {
        if (root ==null) return null;
        if (root.val == p.val || root.val == q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null &&  right != null) return root;
        return left != null? left: right;
    }

}