package LeetCode;

/**
 * Created by yuliu on 8/27/16.
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < nums[left]) {
                if (target > nums[mid] && target < nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (target < nums[mid] && target > nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
             }

        }
        return -1;
    }

    public static void main(String args[]) {
        SearchInRotatedSortedArray test = new SearchInRotatedSortedArray();
        int[] input = {4, 5, 6, 7, 0, 1, 2};
        System.out.print(test.search(input, 5));
    }
}
