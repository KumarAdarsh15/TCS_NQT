// An automobile company manufactures both a two wheeler (TW) and 
// a four wheeler (FW). A company manager wants to make the 
// production of both types of vehicle according to the given data below:
// 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
// 2nd data, Total number of wheels = W
// The task is to find how many two-wheelers as well as 
// four-wheelers need to manufacture as per the given data.

import java.util.Scanner;

public class TW_FW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vehicles: ");
        int v = sc.nextInt();
        System.out.print("Enter number of wheels: ");
        int w = sc.nextInt();

        if (v > w || w % 2 != 0 || 2 >= w)
            System.out.println("Invalid Input");
        else {
            int tw, fw;
            int a = w / 2;
            fw = a - v;
            tw = v - fw;
            System.out.println("TW: " + tw + " FW: " + fw);
        }
    }
}
