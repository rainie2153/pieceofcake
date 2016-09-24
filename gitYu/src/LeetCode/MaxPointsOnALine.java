package LeetCode;

import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuliu on 9/6/16.
 * Given n points on a 2D plane, find the maximum number of points that lie on the
 * same straight line
 *
 * A line can be represented as y = ax + b
 * we can store it as 斜率c = (y-y1)/(x-x1), c can be p/q
 */
public class MaxPointsOnALine {
    static class Point{
        int x;
        int y;
        Point(int a, int b) {
            this.x = a;
            this.y = b;
        }
    }

    public int maxPoints(Point[] points) {
        if(points== null) {
            return 0;
        }
        if(points.length <= 2) {
            return points.length;
        }
        int max = 0;
        int duplicate = 1;//this field setting is amazing
        Map<Double,Integer> map = new HashMap<Double,Integer>();
        for(int i = 0; i < points.length; i++){
            map.clear();
            duplicate = 1;
            Point p = points[i];
            for(int j = 0 ; j < points.length; j++){
                if(i == j) continue;
                Point tem = points[j];
                double slope = 0.0;
                if(tem.x == p.x && tem.y == p.y){
                    duplicate ++;
                    continue;
                }else if(tem.x == p.x){
                    slope = Integer.MAX_VALUE;
                }else{
                    slope = tem.y == p.y ? 0 : 1.0 * (tem.y - p.y) / (tem.x - p.x);
                }
                map.put(slope, map.containsKey(slope) ? map.get(slope) + 1 : 1 );
            }
            if(map.keySet().size() == 0){
                max = duplicate;
            }
            for(double key : map.keySet()){
                max = Math.max(max, duplicate + map.get(key));
            }

        }
        return max;
    }

    public static void main(String args[]) {
        MaxPointsOnALine test = new MaxPointsOnALine();
        Point one = new Point(2, 4);
        Point two = new Point(2, 4);
        Point three = new Point(4, 8);
        Point[] array = {one, two, three};
        System.out.print(test.maxPoints(array));
    }


}
