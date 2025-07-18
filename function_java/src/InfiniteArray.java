public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 8, 9, 45, 89, 99, 100, 666, 777};
        int target = 45;
        int index = findPosition(arr, target);
        System.out.println("Target found at index: " + index);
    }

    static int findPosition(int[] arr, int target) {
        // Step 1: Find range where target may exist
        int start = 0;
        int end = 1;

        // Expand window exponentially until target <= arr[end]
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            // Double the box size
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        // Make sure end doesn't exceed array bounds
        end = Math.min(end, arr.length - 1);

        // Step 2: Binary search in the found range
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // target found
            }
        }

        return -1; // target not found
    }
}
