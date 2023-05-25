import java.util.Scanner;

public class Banks_Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter tenature year: ");
        int y = sc.nextInt();
        System.out.print("Enter number of banks: ");
        int b = sc.nextInt();
        double bank[] = new double[b];
        int l = 0;
        for (int i = 0; i < b; i++) {
            System.out.print("Enter the no of slab's for Bank : ");
            int n = sc.nextInt();
            double sum = 0;
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the period: ");
                int yrs = sc.nextInt();
                System.out.print("Enter the interest: ");
                double s = sc.nextDouble();
                double sq = Math.pow((1 + s), yrs * 12);// (1 + monthly interest rate)^(number of years * 12) formula
                                                        // that applied
                double emi = (p * (s)) / (1 - 1 / sq);// loan amount * monthly interest rate / ( 1 – 1 /sq)
                sum = sum + emi;
            }
            bank[l++] = sum;
        }
        if (bank[0] < bank[1])
            System.out.println("Bank 1");
        else
            System.out.println("Bank 2");
    }
}
