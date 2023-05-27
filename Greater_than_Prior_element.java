import java.util.Scanner;

public class Greater_than_Prior_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter elemets of array: ");
        int arr[] = new int[n];
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
