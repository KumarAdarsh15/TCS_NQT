import java.util.Scanner;

public class Fitness_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] trainee = new int[3][3];
        int[] average = new int[3];
        int max = 0, round = 1;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the values for round no : " + round++);
            for (int j = 0; j < 3; j++) {
                trainee[i][j] = sc.nextInt();
                if (trainee[i][j] < 1 || trainee[i][j] > 100) {
                    trainee[i][j] = 0;
                    System.out.println("Invalid Input");
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                average[i] = average[i] + trainee[i][j];
            }
            average[i] = average[i] / 3;
        }
        for (int i = 0; i < 3; i++) {
            if (average[i] > max) {
                max = average[i];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (average[i] >= max) {
                System.out.println("Trainee Number is fit: " + (i + 1));
            } else if (average[i] < 70) {
                System.out.println("Trainee " + (i + 1) + " is Unfit");
            }
        }
    }
}
