package Intermidate_java.src;

public class Reverse_String {
    public static void main(String[] args) {
        String Original = "JAVA";
        String reversed = "";

        for (int i = Original.length() - 1; i >= 0; i--){
            reversed += Original.charAt(i);
        }
        System.out.println("The Original String is " + Original);
        System.out.println("The Reversed String is " + reversed);
    }
}
