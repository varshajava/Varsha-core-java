package methods;

import com.sun.deploy.security.SelectableSecurityManager;

public class MethodDemo {

    // access_specifier return_type method_name(parameter){CODE}

    public void makeSquare()
    {
        int number=3;
        System.out.println("Square of given number is : "+number*number);
    }

    public void makeCube()
    {
        int n=3;
        System.out.println("Cube of 3 is : "+n*n*n);
    }

    public void evenOddMethod()
    {
        int num=5;
        if(num%2!=1)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }

    public void dayOfWeek()
    {
        int day=3;

        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Does not found any match");

        }
    }
    public void primeNo()
    {
        int n=11;
        int richa=0;
        for(int a=2;a<n;a++)
        {
            if(n%a==0)
            {
                richa++;
            }
        }
        if(richa==0)
        {
            System.out.println("Prime n0...");
        }
        else
        {
            System.out.println("Non Prime no...");
        }
    }


    public static void main(String[] args) {

        MethodDemo obj=new MethodDemo();

        obj.makeSquare();
        obj.evenOddMethod();
        obj.dayOfWeek();
        obj.makeCube();
        obj.primeNo();
    }
}
