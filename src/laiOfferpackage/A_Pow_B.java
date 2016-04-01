package laiOfferpackage;

/**
 * Created by yuliu on 3/11/16.
 */
public class A_Pow_B {
    public long a_pow_b (int a, int b) {
        if (a == 0) return b > 0 ? 0 : Long.MAX_VALUE;
        if (b == 0) return 1;
        long tmp = a_pow_b(a, b/2);
        if (b % 2 == 0) return tmp*tmp;
        else return tmp*tmp*a;
    }

    public static void main(String[] args) {
        A_Pow_B solution = new A_Pow_B();
        int a=2;
        int b=1;
        System.out.println(solution);
    }
}
