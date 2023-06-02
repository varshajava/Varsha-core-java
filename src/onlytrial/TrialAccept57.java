package onlytrial;

import java.util.Scanner;

public class TrialAccept57 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n=scan.nextInt();
        int flag = 0;
        int flag2 = 0;

        for (int a = n; a != 0; a = a / 10)
        {
            int mod=a%10;
            if(mod==7 )
            {
                flag=flag+1;

            }
            if(mod==5)
            {
                flag2=flag2+1;

            }

        }
        if(flag==1 && flag2==1)
        {
            System.out.println("expected number...");
        }
        else
        {
            System.out.println("not expected number...");
        }
    }

}
