package laiOfferPackage2;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by yuliu on 3/17/16.
 */
public class CheckIfBinaryTreeIsComplete {
    public boolean isCompleted(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        boolean flag = false;
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();

            if (cur.left == null) flag = true;
            else if (flag) return false;
            else queue.offer(cur.left);//flag是true 并且cur.left有孩子

            if (cur.right == null) flag = true;
            else if (flag) return false;
            else queue.offer(cur.right);
        }
        return true;
    }

    static class TreeNode {
        int key;
        TreeNode left;
        TreeNode right;
        TreeNode (int key) {
            this.key = key;
        }
    }


    public static void main(String[] args) {

        //CheckIfBinaryTreeIsComplete test = new CheckIfBinaryTreeIsComplete();
        //Queue<TreeNode> input = new LinkedList<TreeNode>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));




    }
}


