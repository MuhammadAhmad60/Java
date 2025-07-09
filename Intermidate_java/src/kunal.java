package Intermidate_java.src;
//Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.

public class kunal {
    public static void main(String[] args) {
        int count = 0;

        // August days 31
        for (int days = 1; days <= 31; days++){
            if (days % 2 == 0){
                count++;
            }
        }
        System.out.println("Kunal can go out " + count + " days in August");
    }
}
