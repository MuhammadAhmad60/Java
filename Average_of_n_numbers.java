// Calculate Average Of N Numbers

public class Average_of_n_numbers {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50,};
        double sum = 0;

        for (int i = 1; i < numbers.length; i++){
            sum += numbers[i];
        }
        double average = sum/ numbers.length;
        System.out.println("Average " + average);
    }
}
