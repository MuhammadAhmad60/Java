package Intermidate_java.src;

public class Ncr_Npr {
    public static void main(String[] args) {
        int n = 5;
        int r = 3;

        System.out.println("nCr (" + n + ", " + r + ") = " + nCr(n, r));
        System.out.println("nPr (" + n + ", " + r + ") = " + nPr(n, r));

    }
    public static long factorial(int n){
        long fact = 1;
        for (int i = 2; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static long nCr(int n, int r){
        return factorial(n) / (factorial(r) * (n - r));
    }
    public static long nPr(int n, int r){
        return factorial(n) / factorial(n - r);
    }

}
