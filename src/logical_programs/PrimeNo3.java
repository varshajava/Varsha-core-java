package logical_programs;

import java.util.Scanner;

public class PrimeNo3 {
    public static void main(String[] args) {

        int a;
        int richa=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("num = ");
        int num=scan.nextInt();
        for(a=2;a<=num-1;a++)
        {
            if(num%a==0)
            {
                richa=1;
            }
        }
        if(richa==0)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Non prime number");
        }
    }
}
