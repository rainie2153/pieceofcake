package LeetCode;
import java.util.*;
/**
 * Created by yuliu on 9/4/16.
 * Given two words begin and end , and a dict of word list.
 * Find the len of shortest transformation sequence from begin to end
 * 1.Only one letter can be changed at a time
 * 2.Each intermediate word must exist in word list
 *
 * start:"hit"
 * end: "
 */
public class WordLadder {
    public int ladderLength(String start, String end, Set<String> dict) {
        Queue<String> q = new LinkedList<>();
        q.add(start);
        q.add(null);

    }
}
