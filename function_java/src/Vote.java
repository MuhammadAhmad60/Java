import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of a person");
        int age = input.nextInt();
        System.out.println(Eligible_Vote(age));
    }
    public static int  Eligible_Vote(int age){
        if (age >= 18){
            System.out.println("The person is Eligible for vote ");

        }else {
            System.out.println("You are not Eligible for vote");
        }
        return age;
    }
}
