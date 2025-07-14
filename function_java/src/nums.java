

public class nums {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};

        ArrayDoubler doubler = new ArrayDoubler(); // Create an object
        int[] result = doubler.getConcatenation(nums); // Call the method

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static class ArrayDoubler {

        // Method to build the duplicated array
        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2 * n];

            for (int i = 0; i < n; i++) {
                ans[i] = nums[i];
                ans[i + n] = nums[i];
            }

            return ans;
        }
    }
}