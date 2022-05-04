package chapter9;

import java.util.Arrays;

public class CorrectLongestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println("Common substring count for fish and hish : " + commonString("fish", "hish"));
        System.out.println("Common substring count for vista and hish : " + commonString("vista", "hish"));
        System.out.println("Common substring count for fish and fosh : " + commonString("fish", "fosh"));
        System.out.println("Common substring count for fort and fosh : " + commonString("fort", "fosh"));
    }

    static int commonString(String first, String second) {
        int max = 0;
        int[][] cell = new int[first.length()][second.length()];

        for (int i = 0; i < first.length(); i++) {
            for (int j = 0; j < second.length(); j++) {
                char firstChar = first.charAt(i);
                char secondChar = second.charAt(j);
                if (firstChar == secondChar) {
                    max++;
                }
                cell[i][j] = max;
            }
        }
        for (int i = 0; i < first.length(); i++) {
            System.out.println(Arrays.toString(cell[i]));
        }
        return max;
    }
}
