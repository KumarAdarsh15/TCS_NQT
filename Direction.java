import java.util.Scanner;

public class Direction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int a = sc.nextInt();
        int distance = 10, x = 0, y = 0;
        char ch = 'R';
        while (a > 0) {
            switch (ch) {
                case 'R':
                    x = x + distance;
                    ch = 'U';
                    distance = distance + 10;
                    break;

                case 'U':
                    y = y + distance;
                    ch = 'L';
                    distance = distance + 10;
                    break;

                case 'L':
                    x = x - distance;
                    ch = 'D';
                    distance = distance + 10;
                    break;

                case 'D':
                    y = y - distance;
                    ch = 'A';
                    distance = distance + 10;
                    break;

                case 'A':
                    x = x + distance;
                    ch = 'R';
                    distance = distance + 10;
                    break;
            }
            a--;
        }
        System.out.println(x + " , " + y);
    }
}
