package LeetCode;

import java.util.Random;

/**
 * Created by yuliu on 9/17/16.
 */
public class RandomIndexPick {
    int[] nums;
    Random rnd;
    public RandomIndexPick(int[] nums) {
        this.nums = nums;
        this.rnd = new Random();
    }

    public int pick(int target) {
        int result = -1;
        int count = 0; // to record how many targets in the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                continue;
            }
/*
For the nth target, ++count is n. Then the probability that rnd.nextInt(++count)==0 is 1/n. Thus, the probability that return nth target is 1/n.
For (n-1)th target, the probability of returning it is (n-1)/n * 1/(n-1)= 1/n.
*/
           // int a = rnd.nextInt(++count);
            if (rnd.nextInt(++count) == 0) {
                result = i;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int[] nums = {1,2,3,3,3};
        RandomIndexPick test = new RandomIndexPick(nums);
        System.out.print(test.pick(3));

    }

}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
