package LeetCode;

/**
 * Created by yuliu on 8/28/16.
 */
public class CountAndSayMySolution {
    public String countAndSay(int n) {
        if(n == 1) {
            return "1";
        }

        String prev = countAndSay(n - 1);

        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prevNum = prev.charAt(0);
        for(int i = 1; i < prev.length(); ++i) {
            char curNum = prev.charAt(i);
            if(curNum == prevNum) {
                count++;
            } else {
                sb.append(count);
                sb.append(prevNum);
                count = 1;
            }
            prevNum = curNum;
        }
        sb.append(count);
        sb.append(prevNum);

        return sb.toString();
    }

    public static void main(String args[]) {
        CountAndSayMySolution test = new CountAndSayMySolution();
        System.out.print(test.countAndSay(8));
    }
}
