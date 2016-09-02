package laiOfferPackage2;

import java.util.*;

/**
 * Created by yuliu on 6/29/16.
 */
public class LowestCommonAncesterOfKNodes {
    public TreeNode lowestCommonAncestor(TreeNode root, List<TreeNode> nodes) {
        Set<TreeNode> set = new HashSet<>(nodes);
        return helper(root, set);
    }
    private TreeNode helper(TreeNode root, Set<TreeNode> set) {
        if (root == null) {
            return root;
        }
        if (set.contains(root)) {
            return root;
        }
        TreeNode l = helper(root.left, set);
        TreeNode r = helper(root.right, set);
        if (l != null && r != null) {
            return root;
        }
        return l != null ? l : r;
    }


}
