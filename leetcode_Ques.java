//Subtract the Product and Sum of Digits of an Integer
public class leetcode_Ques {
    public static void main(String[] args) {
     int n = 234;
     int sum = 0;
     int product = 1;

     while (n > 0){
         int digit = n % 10;
         sum += digit;
         product *= digit;
         n /= 10;
     }
        System.out.println(product - sum);
       // return product - sum;
    }
}
