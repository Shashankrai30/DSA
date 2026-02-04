package DP;

public class PartitiontoKEqualSumSubsets {
    public static void main(String[] args) {
        int nums[]=new int[]{4,3,2,3,5,2,1};
        int k=4;
        int sum = 0;
        for (int num : nums) sum += num;

        if (sum % k != 0) System.out.println(false);;

        int target = sum / k;
        boolean[] used = new boolean[nums.length];

        System.out.println(backtrack(nums, used, k, 0, 0, target));
    }
    public static boolean backtrack(int[] nums, boolean[] used, int k,
                             int start, int currSum, int target) {

        if (k == 1) return true;

        if (currSum == target) {
            return backtrack(nums, used, k - 1, 0, 0, target);
        }

        for (int i = start; i < nums.length; i++) {
            if (used[i] || currSum + nums[i] > target) continue;

            used[i] = true;
            if (backtrack(nums, used, k, i + 1, currSum + nums[i], target))
                return true;
            used[i] = false;
        }
        return false;
    }
}
