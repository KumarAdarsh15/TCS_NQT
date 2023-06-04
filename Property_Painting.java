import java.util.Scanner;

public class Property_Painting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of interior walls: ");
        int iw = sc.nextInt();
        System.out.print("Enter number of exterior walls: ");
        int ew = sc.nextInt();

        float intP = 18, extP = 12, cost = 0, temp;

        if (iw < 0 || ew < 0)
            System.out.println("Invalid Input");
        else if (iw == 0 && ew == 0)
            System.out.println("Total estimated Cost : 0.0");
        else {
            System.out.println("Enter surface area of " + iw + " interior walls");
            for (int i = 0; i < iw; i++) {
                temp = sc.nextFloat();
                cost += intP * temp;
            }
            System.out.println("Enter surface area of " + ew + " exterior walls");
            for (int i = 0; i < ew; i++) {
                temp = sc.nextFloat();
                cost += extP * temp;
            }
        }
        System.out.printf("Total estimated Cost : " + cost + " INR");
    }
}