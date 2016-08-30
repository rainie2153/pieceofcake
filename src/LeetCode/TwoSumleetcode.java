package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuliu on 8/24/16.
 */
public class TwoSumleetcode {
//    public int[] indexofTwoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int tmp = target - nums[i];
//            if (map.containsKey(tmp)) {
//                return new int[] {map.get(tmp), i};
//            } else {
//                map.put(nums[i], i);
//            }
//        }
//        return new int[] {-1, -1};
//    }
    public int[] indexofTwoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }
    public static void main(String args[]) {
        TwoSumleetcode test = new TwoSumleetcode();
        int[] nums = {2,7,1,5,4};
        System.out.print(test.indexofTwoSum(nums, 9));
    }
}
