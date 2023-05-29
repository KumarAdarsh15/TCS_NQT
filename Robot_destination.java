import java.util.Scanner;

public class Robot_destination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
        // Initializing the leftmost column with 1
        for (int i = 0; i < m; i++) {
            arr[i][0] = 1;
        }

        // Initializing the topmost row with 1
        for (int j = 0; j < n; j++) {
            arr[0][j] = 1;
        }

        // Calculate the number of paths for each cell
        // by adding the number of paths from the left and top cells
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }

        System.out.println("Total number of ways the robot can reach the destination: " + arr[m - 1][n - 1]);
    }
}
