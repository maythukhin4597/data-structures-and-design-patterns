package linkedlist;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class Leetcod {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals);
        for (int i = 0; i < intervals.length; i++) {
            Arrays.sort(intervals[i]);
        }
        int i = 0, j = i + 1;
        while (j < intervals.length) {
            //merge case
            if (intervals[j][0] >= intervals[i][1] || intervals[j][1] >= intervals[i][1]) {
                intervals[j][0] = intervals[i][0];
                intervals[i][0] = intervals[i][1] = -1;
            }
            i++;
            j++;
        }

        return Stream.of(intervals)
                .filter(a -> a[0] != -1 && a[1] != -1)
                .toArray(int[][]::new);
    }

    public static int[][] merge2(int[][] intervals) {
        int i = 0;
        int j = i + 1;
        while (j < intervals.length) {
            int left = Math.max(intervals[i][0],intervals[i][1]);
            int right = Math.min(intervals[j][0],intervals[j][1]);
            if(left >= right){
                intervals[j][0] = Math.min(Math.min(intervals[i][0],intervals[i][1]),Math.min(intervals[j][0],intervals[j][1]));
                intervals[j][1] = Math.max(Math.max(intervals[i][0],intervals[i][1]),Math.max(intervals[j][0],intervals[j][1]));
                intervals[i][0] = intervals[i][1] = -1;
            }
            i++;j++;
        }
        return Stream.of(intervals)
                .filter(a -> a[0] != -1 && a[1] != -1)
                .toArray(int[][]::new);

    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] intervals1 = {{1, 4}, {0, 0}};
        int[][] result = merge2(intervals1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i][0]);
            System.out.println(result[i][1]);
        }
    }
}
