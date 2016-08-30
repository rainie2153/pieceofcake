package LeetCode;
import java.util.*;
/**
 * Created by yuliu on 8/8/16.
 */
public class CombinationSum4 {
    public int combinationSum4 (int[] array, int target){
        if(array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        helper(array, target, map);
        return sum;
    }

    public int helper(int[] array, int target, Map<Integer, Integer> map) {
        if (target == 0) {
            return 1;
        }
        if (target < 0) {
            return 0;
        }
        if (map.containsKey(target)) {
            return map.get(target);
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += helper(array, target - array[i], map);
        }
        map.put(target, sum);
        return sum;
    }
}
