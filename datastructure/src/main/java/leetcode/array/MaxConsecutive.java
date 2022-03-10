package leetcode.array;

class MaxConsecutive {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int oldMax = 0;
        int newMax = 0;
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            if (nums[0] == 0) {
                return 0;
            } else return 1;
        }

        int i = 0;
        int j = i + 1;

        while (j < nums.length && i < j) {
            if (nums[i] == 0) {
                i++;
                j = i + 1;
            } else {
                newMax++;
                if (nums[i] == nums[j]) {
                    newMax++;
                    j++;
                } else if (nums[i] != nums[j]) {
                    if (newMax > oldMax) {
                        oldMax = newMax;
                    }
                    i = j;
                    j = i + 1;
                    newMax = 0;
                }
            }

        }
        if (newMax > oldMax) {
            oldMax = newMax;
        }
        return oldMax;
    }

    public static int calc(int[] nums) {
        int oldMax = 0;
        int newMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                newMax = 0;
            } else {
                newMax++;
                oldMax = Math.max(newMax, oldMax);
            }
        }
        return oldMax;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1,1,1,0,0};
        int ans = calc(nums);
        System.out.println(ans);
    }
}