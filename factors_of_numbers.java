import java.util.Scanner;

//Input a number and print all the factors of that number (use loops).
public class factors_of_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = input.nextInt();

        System.out.println("factors of " + number + " are ");

        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                System.out.println(i);
            }

        }
    }
}
