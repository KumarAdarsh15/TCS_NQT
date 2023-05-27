import java.util.Scanner;

public class Supermarket_Barcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Barcode Digit: ");
        int n = sc.nextInt();
        int mul = 1;
        while (n != 0) {
            int ls = n % 10;
            mul = mul * ls;
            n = n / 10;
        }
        System.out.println("Price = " + mul);
    }
}
