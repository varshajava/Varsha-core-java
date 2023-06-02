package methods;

import java.util.Scanner;

public class ReturnString {

    public String greater(int num)
    {
        if(num<10)
        {
            return "Number less than 10";
        }
        else if(num>=10 && num<100)
        {
            return "Number greater than 10 but less than 100";
        }

        num=num*10;
            return "Number greater than or equal to 100";



    }





    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter any number : ");
        int num= scan.nextInt();

        ReturnString obj=new ReturnString();
        String result=obj.greater(num);
        System.out.println(result);




    }
}
