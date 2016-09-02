package laiOfferPackage2;

/**
 * Created by yuliu on 6/29/16.
 */
//Use the least number of comparision to get largest and smallest number in the given integer array.
    //return the largest and the smallest number
    //The given array is not null and has length of at least 1
    //example: {2,1,5,4,3} -> {5,1}
public class LargestAndSmallest {
    public int[] largestAndSmallest(int[] array) {
        int n = array.length;
        for(int i = 0; i < n / 2; i++) {
            if(array[i] < array[n - 1 - i]) {
                swap(array, i, n - 1 - i);
            }
        }
        return new int[] {largest(array, 0, (n - 1) / 2), smallest(array, n / 2, n - 1)
        };
    }
    private int largest(int[] array, int left, int right) {
        int largest = array[left];
        for (int i = left + 1; i <= right; i++) {
            largest = Math.max(largest, array[i]);
        }
        return largest;
    }
    private int smallest(int[] array, int left, int right) {
        int smallest = array[left];
        for (int i = left + 1; i <= right; i++) {
            smallest = Math.min(smallest, array[i]);
        }
        return smallest;
    }
    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        LargestAndSmallest test = new LargestAndSmallest();
        int[] input = {2, 1, 5, 4, 3};
        test.largestAndSmallest(input);
    }
}
