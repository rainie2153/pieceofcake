package LeetCode;

/**
 * Created by yuliu on 7/19/16.
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        //create target map
        int[] target = new int[256];//{,,,,,,,,,}
        for (int i = 0; i < t.length(); i++) {// target string loop
            target[t.charAt(i)]++;
        }

        int[] source = new int[256];
        int match = 0;
        String res = null;
        int slow = 0;
        for (int i = 0; i < s.length(); i++) {
            char fc = s.charAt(i);
            source[fc]++;
            if (source[fc] <= target[fc]) {
                match++;
            }
            while (slow < s.length() && match == t.length()) {
                char sc = s.charAt(slow);
                source[sc]--;

                if (source[sc] < target[sc]) {
                    match--;
                    String sub = s.substring(slow, i + 1);
                    if (res == null || res.length() > sub.length()) {
                        res = sub;
                    }
                }
                slow++;
            }
        }
        return res == null ? "" : res;
    }
    public static void main(String args[]) {
        MinimumWindowSubstring test = new MinimumWindowSubstring();
        System.out.print(test.minWindow("ADOBECODEBANC", "ABC"));
    }
}
