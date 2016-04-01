package laiOfferpackage;

/**
 * Created by yuliu on 3/15/16.
 */
public class BalancedBinaryTree {

    static class TreeNode {
        int key;
        TreeNode left;
        TreeNode right;
        TreeNode (int key) {
            this.key = key;
        }
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int getHeight(TreeNode root) {
        if (root == null) return 0;
        int leftheight = getHeight(root.left);
        int rightheight = getHeight(root.right);
        return 1 + Math.max(leftheight, rightheight);
    }
}
