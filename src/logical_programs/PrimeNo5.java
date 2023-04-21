package logical_programs;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PrimeNo5 {
    public static void main(String[] args) {

        int a;
        int richa=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("num = ");
        int num=scan.nextInt();
        for(a=2;a<=sqrt(num);a++)
        {
            if(num%a==0)
            {
                richa=1;
            }

        }
        if(richa==1)
        {
            System.out.println("no prime no");
        }
        else
        {
            System.out.println("prime no");
        }
    }
}
