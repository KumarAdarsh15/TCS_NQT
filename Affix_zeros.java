import java.util.Scanner;

class Affix_zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting positive integer: ");
        int n = sc.nextInt();
        System.out.print("Enter the ending positive integer: ");
        int m = sc.nextInt();

        int maxDigit = String.valueOf(m).length(); // for finding length of greatest element

        for (int i = n; i <= m; i++) {
            String number = String.valueOf(i);// Convert the number to a string

            int numZeroes = maxDigit - number.length(); // Calculate the number of zeros to affix

            // Affix the leading zeros
            StringBuilder Number = new StringBuilder();
            for (int j = 0; j < numZeroes; j++) {
                Number.append("0");
            }
            Number.append(number);

            // Print the padded number
            System.out.println(Number.toString());
        }
    }
}