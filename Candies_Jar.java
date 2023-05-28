import java.util.Scanner;

public class Candies_Jar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        System.out.print("Enter number of candies to be sold: ");
        int k = sc.nextInt();
        if (k > 0 && k <= 5) {
            System.out.println("Number of Candies Sold: " + k);
            System.out.println("Number of Candies available: " + (n - k));
        } else {
            System.out.println("INVALID INPUT");
            System.out.println("Number of Candies available: " + n);
        }
    }
}
