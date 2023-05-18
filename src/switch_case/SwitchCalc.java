package switch_case;

import java.util.Scanner;

public class SwitchCalc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your choice : \n press a for addition \n press b for subtraction \n press c for multiplication\n press d for division \n press e for modulus\n press f for minimum number \n press g for maximum number \n");
        char ch = scan.next().charAt(0);
        System.out.println("Now enter two numbers to perform operation : ");
        System.out.println("enter number 1 : ");
        int n1=scan.nextInt();
        System.out.println("enter number 2 : ");
        int n2=scan.nextInt();

        switch(ch)
        {
            case 'a' :
                int add=n1+n2;
                System.out.println("addition is : "+add);
                break;

            case 'b' :
                int sub=n1-n2;
                System.out.println("subtraction is : "+sub);
                break;
            case 'c' :
                int mul=n1*n2;
                System.out.println("multiplication is : "+mul);
                break;
            case 'd':
                int div=n1/n2;
                System.out.println("division is : "+div);
                break;
            case 'e' :
                int mod=n1%n2;
                System.out.println("modulus is : "+mod);
                break;
            case 'f':
                if(n1<n2) {
                    System.out.println("minimum number is : " + n1);
                    break;
                }
                else
                {
                    System.out.println("minimum number is : "+n2);
                    break;
                }
            case 'g':
                if(n1>n2)
                {
                    System.out.println("maximum number is : "+n1);
                    break;
                }
                else
                {
                    System.out.println("maximum number is : "+n2);
                    break;
                }
            default :
                System.out.println("your choice did not match ");
        }




    }
}

