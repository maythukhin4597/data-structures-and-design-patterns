package leetcode.array;

public class FindEvenNumbers {

    public static int findNumbers(int[] nums) {

        int maxEven = 0;
        for (int num : nums) {
            int size = String.valueOf(num).length();
            if (size % 2 == 0) {
                maxEven++;
            }
        }
        return maxEven;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1000};
        int maxEven = findNumbers(nums);
        System.out.println(maxEven);
    }
}
