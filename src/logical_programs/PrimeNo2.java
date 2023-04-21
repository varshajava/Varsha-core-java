package logical_programs;

import java.util.Scanner;

public class PrimeNo2 {
    public static void main(String[] args) {

        int a;

        Scanner scan=new Scanner(System.in);
        System.out.println("num = ");
        int num=scan.nextInt();
        for(a=2;a<num;a++)
        {
            if(num%a==0)
            {
                break;
            }
        }
        if(num==a)
        {
            System.out.println("PRIME NO");

        }
        else
        {
            System.out.println("NON PRIME NO");
        }
    }
}
