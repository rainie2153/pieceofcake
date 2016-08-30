package LeetCode;

import java.util.*;

/**
 * Created by yuliu on 7/18/16.
 */
public class PermutationSequence {
    public String getPermutation(int n, int k) {
        List<Integer>  num = new LinkedList<Integer>();
        for (int i = 1; i <= n; i++) {
            num.add(i);
        }
        int[] fact = new int[n];
        fact[0] = 1;
        for (int i = 1; i < n; i++) {
            fact[i] = fact[i - 1] * i;
        }
        k = k - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            int ind = k / fact[i - 1];
            k = k % fact[i - 1];
            sb.append(num.get(ind));
            num.remove(ind);
        }
        System.out.print(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        PermutationSequence test = new PermutationSequence();
        test.getPermutation(3, 5);
        System.out.print("a" + "nima"+"@@@#");
    }
}
