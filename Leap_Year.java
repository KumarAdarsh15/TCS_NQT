import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int yr = sc.nextInt();

        if (yr % 4 == 0) {
            if (yr % 100 != 0)
                System.out.println(yr + " is LEAP YEAR");
            else
                System.out.println(yr + " is NOT LEAP YEAR");
        } else {
            if (yr % 400 == 0)
                System.out.println(yr + " is LEAP YEAR");
            else
                System.out.println(yr + " is NOT LEAP YEAR");
        }
    }
}
