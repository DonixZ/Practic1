import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        // System.out.print("Danny ");
        // System.out.println("David is a good friend");
        // System.out.print("hii ");
        // System.out.println("God is good");

        //int x1 = 17;
        //int x2 = 34;
//
        //if (x1 > x2)
        //    System.out.println("Nice");
        //else
        //    System.out.println("Not Nice");

        //int y = 16;

        //if(y%5==0)
        //    System.out.println("This is a magic number.");
        //else
        //    System.out.println("This number is not a magic number");

        //int zone = 15;
//
        //if (!(zone < 10 && zone > 40));
        //    System.out.println("Its Magic");

        // int X = 16;

        // if (X > 0 && X % 2 == 0)
        //     System.out.println(X);

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter your name:");
        //String name = scanner.next();
        //System.out.println("Your name is " + name);

        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Please enter your number:");
        //int num = scanner.nextInt()/2;
        //System.out.println("Your number is "+ num);
        //char s = '5';
        Scanner input = new Scanner(System.in);
        char day;


        System.out.print("Please enter number of day : ");
        day = input.next().charAt(0);


        switch (day) {
            case '1':
                System.out.print("Sunday");
                break;
            case '2':
                System.out.print("Monday");
                break;
            case '3':
                System.out.print("Tuesday");
                break;
            case '4':
                System.out.print("Wednesday");
                break;
            case '5':
                System.out.print("Thursday");
                break;
            case '6':
                System.out.print("Friday");
                break;
            case '7':
                System.out.print("Saturday");
                break;
            default:
                System.out.print("Invalid Input");


        }


    }
}










