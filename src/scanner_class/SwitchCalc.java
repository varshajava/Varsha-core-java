package scanner_class;

//a Calculator which calculates 1 ADDITION, 2 SUBTRACTION ,3 MULTIPLICATION ,4 DIVISION, 5 PERCENTAGE

import java.util.Scanner;

public class SwitchCalc {

    public double calculator(char ch,int a,int b)
    {
        double varsha=0.0;
        switch(ch)
        {
            case 'a':
            {
                varsha=a+b;
                System.out.println("additon is : ");
               // return add;
                break;
            }
            case 's':
            {
                varsha=a-b;
                System.out.println("substraction is : ");
               // return sub;
                break;
            }
            case 'm':
            {
                varsha=a*b;
                System.out.println("Multiplication is : ");
               // return mul;
                break;
            }
            case 'd':
            {
                varsha=(double)a/b;
                System.out.println("division is : ");
                //return div;
                break;
            }
            case 'p':
            {
                varsha=(a*b)/100;
                System.out.println("Percentage of given number is : ");
                break;
            }
        }
    return varsha;
    }
    public static void main(String[] args1)
    {
        Scanner scan =new Scanner(System.in);
        char flag='y';
        while(flag=='y')
        {
            System.out.println("enter any option\n a for addition \n s for subtraction \n m for multiplication \n d for division\n p for percentage...");
            char ch=scan.next().charAt(0);


            System.out.println("Enter number 1 : ");
            int a=scan.nextInt();
            System.out.println("Enter number 2 : ");
            int b=scan.nextInt();

            SwitchCalc obj=new SwitchCalc();

            double result=obj.calculator(ch,a,b);
            System.out.println(result);

            System.out.println("Press 'y' to continue or press 'n' to exit... ");
            flag=scan.next().charAt(0);



        }//while closed



    }//main closed
}//class closed
