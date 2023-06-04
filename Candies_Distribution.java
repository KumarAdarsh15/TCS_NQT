import java.util.Scanner;

public class Candies_Distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of candies to be distributed: ");
        int c = sc.nextInt();
        System.out.print("Enter total number of children: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int j = 0;
        while (c > 0) {
            for (int i = 0; i < n; i++) {
                j++;
                if (c <= 0)
                    break;
                else {
                    if (j < c)
                        arr[i] = arr[i] + j;
                    else
                        arr[i] = arr[i] + n;
                    n = n - j;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
