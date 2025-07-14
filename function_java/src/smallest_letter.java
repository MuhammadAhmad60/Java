public class smallest_letter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'a'; // if the value is not found its wrap around and return the greatest character
        char result = nextgreatestlatter(arr, target);
        System.out.println("Next greatest letter after '" + target + "': " + result);
    }
    public static char nextgreatestlatter(char[] arr, char target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        if(start == arr.length){
            return arr[0];
        }else {
            return arr[start];
        }
    }
}
