import java.util.Scanner;

public class newbCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("please enter operator: ");
        char op = input.next().charAt(0);
        System.out.print("Please enter the second number: ");
        int num2 = input.nextInt();

        float result;
        switch (op) {
            case '+' -> {
                result = num1 + num2;
                System.out.print((int) result);
            }
            case '-' -> {
                result = num1 - num2;
                System.out.print((int) result);
            }
            case '*' -> {
                result = num1 * num2;
                System.out.print((int) result);
            }
            case '/' -> {
                result = (float) num1 / (float) num2;
                System.out.print(result);
            }
            case '%' -> {
                result = (float) num1 % (float) num2;
                System.out.print((int) result);
            }
            default -> System.out.print("Invalid Input");
        }
    }
}
