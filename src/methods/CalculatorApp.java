package methods;

import jdk.nashorn.internal.ir.CaseNode;

import java.util.Scanner;

public class CalculatorApp {

    public int addition(int a,int b)
    {
        int add=a+b;

        return add;

    }

    public int subtraction(int a,int b)
    {
        int sub=a-b;

        return sub;
    }

    public int multiplication(int a,int b)
    {
        int mul=a*b;
        return mul;
    }

    public double division(int a,int b)
    {
        double div=(double)a/b;
        return div;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        CalculatorApp obj = new CalculatorApp();


        char flag = 'Y';
        while (flag == 'Y') {

        //if we are taking String instead of char then we have to use .equals("Y") method for comparison

            System.out.println("Please choose any option :  \n  press 1 for addition... \n  press 2 for subtraction...\n press 3 for multiplication...\n press 4 for division... ");
            int option = scan.nextInt();


            if (option == 1) {
                System.out.println("Enter the value of a = ");
                int a = scan.nextInt();
                System.out.println("Enter the value of b = ");
                int b = scan.nextInt();


                int result1 = obj.addition(a, b);
                System.out.println("Addition is : " + result1);

            }
            if (option == 2) {
                System.out.println("Enter the value of a = ");
                int a = scan.nextInt();
                System.out.println("Enter the value of b = ");
                int b = scan.nextInt();

                int result2 = obj.subtraction(a, b);
                System.out.println("Subtraction is : " + result2);
            }
            if (option == 3) {
                System.out.println("Enter the value of a = ");
                int a = scan.nextInt();
                System.out.println("Enter the value of b = ");
                int b = scan.nextInt();

                int result3 = obj.multiplication(a, b);
                System.out.println("Multiplication is : " + result3);
            }
            if (option == 4) {
                System.out.println("Enter the value of a = ");
                int a = scan.nextInt();
                System.out.println("Enter the value of b = ");
                int b = scan.nextInt();

                double result4 = obj.division(a, b);
                System.out.println("Division is : " + result4);
            }
            //Scanner scan2 = new Scanner(System.in);
            System.out.println("Press Y to continue calculator OR press N to exit from the calculator : ");
            flag= scan.next().charAt(0);

        }//while closed

    }
}
