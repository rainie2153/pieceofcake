package laiOfferPackage3;

import java.util.*;

/**
 * Created by yuliu on 7/3/16.
 */
//Find all common elements in 3 sorted arrays
    //The 3 given sorted arrays are not null
    //There could be duplicate elements in each of the arrays
    //A = {1,2,2,3} B = {2,2,3,5} C={2,2,4} the common elements are [2,2]
public class CommonElementsInThreeSortedArrays{
    public List<Integer> common(int[] a, int[] b, int[] c) {
        List<Integer> common = new ArrayList<>();
        int ai = 0;
        int bi = 0;
        int ci = 0;
        while (ai < a.length && bi < b.length && ci < c.length) {
            if (a[ai] == b[bi] && b[bi] == c[ci]) {
                common.add(a[ai]);
                ai++;
                bi++;
                ci++;
            } else if (a[ai] <= b[bi] && a[ai] <= c[ci]) {
                ai++;
            } else if (b[bi] <= a[ai] && b[bi] <= c[ci]) {
                bi++;
            } else {
                ci++;
            }
        }
        return common;
    }


}
