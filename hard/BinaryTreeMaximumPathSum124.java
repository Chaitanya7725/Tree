package hard;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreeMaximumPathSum124 {

    static int maxSum = Integer.MIN_VALUE;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxPathSum(root));
    }

    public static int maxPathSum(TreeNode root) {
        maxSum = root.val;
        dfs(root);
        return maxSum;
    }

    public static int dfs(TreeNode root){
        if(root == null) return 0;
        int left = Integer.max(dfs(root.left),0);
        int right = Integer.max(dfs(root.right),0);
        maxSum = Integer.max(maxSum,root.val + left + right);
        return root.val + Math.max(left,right);
    }


}
