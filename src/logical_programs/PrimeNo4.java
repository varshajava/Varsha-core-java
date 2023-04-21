package logical_programs;

import java.util.Scanner;

public class PrimeNo4 {
    public static void main(String[] args) {

        int a;
        int richa=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("num = ");
        int num=scan.nextInt();

        for(a=2;a<=(num/2);a++)
        {
            if(num%a==0)
            {
                richa++;
            }
        }
        if(richa==0)
        {
            System.out.println("prime no");
        }
        else
        {
            System.out.println("Non prime no");
        }
    }
}
