package medium;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree98 {
    static TreeNode prevNode = null;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(11);
        root.left = new TreeNode(9);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(17);

        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(5);

        System.out.println(isValidBST(root));
    }


    public static boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        boolean isValidLeftBST = isValidBST(root.left);
        if(!isValidLeftBST) {
            return false;
        }
        // process root node
        if(prevNode != null && prevNode.val >= root.val) {
            return false;
        } else { //
            prevNode = root;
        }

        return isValidBST(root.right);
    }
//    public static boolean isValidBST(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        helper(root,res);
//        for (int i = 1; i < res.size(); i++) {
//            if(res.get(i-1)>=res.get(i))
//                return false;
//        }
//        return true;
//    }
//
//    public static void helper(TreeNode root, List<Integer> res) {
//        if(root != null){
//            helper(root.left, res);
//            res.add(root.val);
//            helper(root.right, res);
//        }
//    }


}
