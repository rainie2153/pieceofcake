package LeetCode;
import java.util.*;
/**
 * Created by yuliu on 8/10/16.
 */
public class MaximumRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int n = matrix.length, m = matrix[0].length;
        int[] array = new int[m];
        int max = 0;
        for (int i = 0; i < n; i++) {
            update(matrix, i, array);
            max = Math.max(max, findMax(array));
        }
        return max;
    }

    public void update(char[][] matrix, int row, int[] array) {
        int m = array.length;
        for (int i = 0; i < m; i++) {
            array[i] = matrix[row][i] == '0' ? 0 : 1 + array[i];
        }
    }

    public int findMax(int[] array) {
        Deque<Integer> stack = new LinkedList<Integer>();
        stack.push(-1);
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (stack.peek() == -1 || array[i] >= array[stack.peek()]) {
                stack.push(i);
            } else {
                while (stack.peek() != -1 && array[stack.peek()] > array[i]) {
                    int h = array[stack.pop()];
                    int l = stack.peek();
                    int r = i;
                    max = Math.max(max, h * (r - l - 1));
                }
                stack.push(i);
            }
        }

        while (stack.peek() != -1) {
            int h = array[stack.pop()];
            int l = stack.peek();
            int r = array.length;
            max = Math.max(max, h * (r - l - 1));
        }

        return max;
    }
    public static void main(String[] args) {
        MaximumRectangle test = new MaximumRectangle();
        char[][] input = {  {1, 0, 1, 0, 0},
                            {1, 0, 1, 1, 1},
                            {1, 1, 1, 1, 1},
                            {1, 0, 0, 1, 0}};
        System.out.print(test.maximalRectangle(input));

    }
}
