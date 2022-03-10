package leetcode;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "abcabc";
        boolean isSubsquence = checkSubsequence(s, t);
        System.out.println(isSubsquence);
    }

    private static boolean checkSubsequence(String s, String t) {
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        int sLength = s.length();
        int tLength = t.length();
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex != sLength && tIndex != tLength) {
            if (schars[sIndex] == tchars[tIndex]) {
                sIndex++;
                tIndex++;
            } else {
                tIndex++;
            }
        }
        if (sIndex == sLength) {
            return true;
        } else return false;
    }
}
