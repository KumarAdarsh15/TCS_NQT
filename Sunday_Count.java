import java.util.Scanner;

public class Sunday_Count {
    public static int firstSunday(String day) {
        String arr[] = { "mon", "tue,", "wed", "thu", "fri", "sat", "sun" };
        // int res=6;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(day))
                return 6 - i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of the month starting (mon , tue , wed , thu , fri , sat , sun): ");
        String str = sc.next();
        System.out.print("Enter the number of day's: ");
        int n = sc.nextInt();

        n = n - firstSunday(str);
        if (n >= 0)
            System.out.println((n / 7) + 1);
        else
            System.out.println(0);
    }
}
