package LeetCode;

/**
 * Created by yuliu on 8/3/16.
 */
public class LargestBst {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Result {  // (size, rangeLower, rangeUpper) -- size of current tree, range of current tree [rangeLower, rangeUpper]
        int size;
        int lower;
        int upper;

        Result(int size, int lower, int upper) {
            this.size = size;
            this.lower = lower;
            this.upper = upper;
        }
    }

    int max = 0;

    public int largestBSTSubtree(TreeNode root) {
        if (root == null) { return 0; }
        traverse(root);
        return max;
    }

    private Result traverse(TreeNode root) {
        if (root == null) { return new Result(0, Integer.MAX_VALUE, Integer.MIN_VALUE); }
        Result left = traverse(root.left);
        Result right = traverse(root.right);
        if (left.size == -1 || right.size == -1 || root.val <= left.upper || root.val >= right.lower) {
            return new Result(-1, 0, 0);
        }
        int size = left.size + 1 + right.size;
        max = Math.max(size, max);
        return new Result(size, Math.min(left.lower, root.val), Math.max(right.upper, root.val));
    }

    public static void main(String[] args) {
//        LargestBst test = new LargestBst();
//        TreeNode ten = new TreeNode(10);
//        TreeNode seven = new TreeNode(7);
//        TreeNode twelve = new TreeNode(12);
//        TreeNode two = new TreeNode(2);
//        TreeNode five = new TreeNode(8);
//        TreeNode eleven = new TreeNode(11);
//        TreeNode fourteen = new TreeNode(14);
//
//        ten.left = seven;
//        ten.right = twelve;
//        seven.left = two;
//        seven.right = five;
//        twelve.left = eleven;
//        twelve.right = fourteen;
//        //System.out.print(test.largestBSTSubtree(ten));
        System.out.println(Math.log10(Math.pow(3, 5)) / Math.log10(3) % 1);
        System.out.println(Math.log10(9) );
        System.out.println(Math.log10(3));



    }

}
