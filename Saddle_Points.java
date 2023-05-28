import java.util.Scanner;

public class Saddle_Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();
        System.out.println("enter elements of matrix: ");
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int min = 0;
            for (int j = 1; j < n; j++) { // for finding least element in the row
                if (arr[i][j] < arr[i][min]) {
                    min = j;
                }
            }

            boolean flag = true;
            for (int k = 0; k < arr.length; k++) { // for finding greatest element in column
                if (arr[k][min] > arr[i][min]) {
                    flag = false;
                    break;

                }
            }
            if (flag == true) {
                System.out.println(arr[i][min]);
                return;
            }
        }
        System.out.println("Not found!");
    }
}
