public class LeetCode {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        LeetCode lc = new LeetCode();
        int[] result = lc.searchRange(nums, target);

        System.out.println("Start: " + result[0] + ", End: " + result[1]);
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);  // find start index
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false); // find end index
        }

        return ans;
    }

    public int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                // Move towards left (for start index) or right (for end index)
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
