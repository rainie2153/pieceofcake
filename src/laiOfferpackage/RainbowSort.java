package laiOfferpackage;

import java.util.Arrays;

/**
 * Created by yuliu on 3/10/16.
 */
public class RainbowSort {
    public int[] rainbowSort(int[] array) {
        if (array == null || array.length <= 1) {
           return array;
        }
        int i = 0;//i++
        int j = 0;//j++
        int k = array.length - 1;//k--相向 同向
        while (j <= k) {//-1-1-1-10000000XXXXXXXX111111
            if (array[j] == -1 ) {
                swap(array, i++, j++);
            } else if (array[j] == 0) {
                j++;
            } else {
                swap(array, j, k--);
            }
        }
        return array;
    }


    private void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {0,1,-1,0,1,1,-1};
        RainbowSort solution = new RainbowSort();
        array = solution.rainbowSort(array);
        System.out.println(Arrays.toString(array));
    }
}
