import java.util.Scanner;

class Count_Rock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter size of samples: ");
        int s = sc.nextInt();
        System.out.print("Enter number of range's: ");
        int r = sc.nextInt();

        int arr[] = new int[s];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < r; i++) {
            System.out.print("Enter minimum range: ");
            int min = sc.nextInt();
            System.out.print("Enter minimum range: ");
            int max = sc.nextInt();

            for (int j = 0; j < s; j++) {
                if ((arr[j] >= min) && (arr[j] < max))
                    count++;
            }
            System.out.println(count);
        }
    }
}