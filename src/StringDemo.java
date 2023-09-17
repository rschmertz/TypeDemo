import java.util.Scanner;

public class StringDemo {

    public static void printTotalEasy(int x, int y) {
        System.out.println("Total is " + (x + y));
    }

    public static void printTotalBrokenDown(int x, int y) {
        int total = x + y;
        String totalString = Integer.toString(total);
        String outputPreamble = "Total is ";
        String outputText = outputPreamble + totalString;
        System.out.println(outputText);
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        printTotalEasy(x, y);
        printTotalBrokenDown(x, y);
    }
}