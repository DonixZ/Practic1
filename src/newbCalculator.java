import java.util.Scanner;

public class newbCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;
        char op;
        float result;


        System.out.print("Please enter the first number: ");
        num1 = input.nextInt();
        System.out.print("please enter operator: ");
        op = input.next().charAt(0);
        System.out.print("Please enter the second number: ");
        num2 = input.nextInt();


        if (op == '+') {
            result = num1 + num2;
            System.out.print((int) result);
        } else if (op == '-') {
            result = num1 - num2;
            System.out.print((int) result);
        } else if (op == '*') {
            result = num1 * num2;
            System.out.print((int) result);
        } else if (op == '/') {
            result = (float) num1 / (float) num2;
            System.out.print(result);
        } else if (op == '%') {
            result = num1 % num2;
            System.out.print((int) result);
        } else {
            System.out.print("Wrong Input");
        }
    }
}
