
// Given a maximum of four digits to the base 17(10 -> A, 11 -> B, 12 -> C, 16 -> G) as input, 
// output its decimal value.
// Input:23GF
// Output:10980
import java.util.Scanner;

class Decimal_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number & alphabets(<=4): ");
        String str = sc.next();
        System.out.println(Integer.parseInt(str, 17));
    }
}