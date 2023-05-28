import java.util.Scanner;

public class Keyword_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a keyword: ");
        String str = sc.next();
        String arr[] = { "break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map",
                "range", "return", "struct", "type", "var" };
        if (str.equals(arr))
            System.out.println(str + " is a keyword");
        else
            System.out.println(str + " is not a keyword");
    }
}
