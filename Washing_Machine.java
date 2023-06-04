import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Washing_Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weigth of clothes(int grams): ");
        int c = sc.nextInt();

        if (c < 0)
            System.out.println("INVALID INPUT");
        else if (c == 0)
            System.out.println("Time Estimated: 0 minute");
        else if (c > 0 && c <= 2000)
            System.out.println("Time Estimated: 25 minutes");
        else if (c > 2000 && c <= 4000)
            System.out.println("Time Estimated: 35 minutes");
        else if (c > 4000 && c <= 7000)
            System.out.println("Time Estimated: 45 minutes");
        else
            System.out.println("OVERLOADED");
    }
}
