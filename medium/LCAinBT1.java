package medium;

public class LCAinBT1 {

    public static boolean a;
    public static boolean b;
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode ans = lowestCommonAncestor(root, new TreeNode(11), new TreeNode(10));
        System.out.println(a+" "+b);
        if (ans!=null)
            System.out.println(ans.val);
        else
            System.out.println("null");

    }

    public static TreeNode lowestCommonAncestor(TreeNode root,TreeNode p, TreeNode q) {
        if (root ==null) return null;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (root.val == p.val || root.val == q.val) {
            if(root.val == p.val) a =true;
            if(root.val == q.val) b =true;
            return root;
        }

        if(left != null &&  right != null) return root;
        return left != null? left: right;
    }
}
