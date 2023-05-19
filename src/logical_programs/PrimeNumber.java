package logical_programs;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n=scan.nextInt();
        boolean flag=false;

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=true;
            }
        }
        if(!flag)
        {
            System.out.println("Prime no");
        }
        else
        {
            System.out.println("Non Prime no");
        }
    }
}
