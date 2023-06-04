import java.util.Scanner;

public class Prime_number {
    static boolean check(int n) {
        return n > 0;
    }

    static boolean isPrime(int n) {
        if (n == 2)
            return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if (!check(n))
            System.out.println("Please enter a positive number.");
        else if (isPrime(n))
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
}
