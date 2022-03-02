import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = in.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = in.nextInt();
        System.out.println(mult(a, b));
    }


    public static void add(int x, int y) {
        System.out.print(x + " + " + y + " = " + (x + y));
    }

    public static double div(double num1, double num2) {
        return num1 / num2;
    }

    public static boolean isxPositive(int x) {
        return x > 0;

    }

    public static double sq(double x) {
        double t;
        double sqroot = x / 2;
        do {
            t = sqroot;
            sqroot = (t + (x / t)) / 2;
        }
        while ((t - sqroot) != 0);
        return sqroot;
    }

    public static int mult(int num1, int num2) {
        return num1 * num2;
    }
}










