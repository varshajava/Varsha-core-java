package basic_programs;

public class DoubleOperator {
    public static void main(String[] args) {



        double a=9.5;
        double b=2.4;

        System.out.println("first number is : "+a);
        System.out.println("Second number is : "+b);

        // find square of given number : number*number

        double square=a*a;


        System.out.println("Square is : "+square);

        double sqa=b*b;

        System.out.println("Square is : "+sqa);


        //  find the sum of two numbers : a+b
        //Addition

        double sum=a+b;

        System.out.println("sum of a and b is : "+sum);

        //Subtraction

        double sub=a-b;
        System.out.println("subtraction of a and b is : "+sub);

        //Multiplication
        double mul=a*b;

        System.out.println("multiplication of a and b is : "+mul);

        //Division
        double div=(double)a/b;
        System.out.println("division of a and b is : "+div);

        //increment operator ++ > or +1
        a++;
        System.out.println("++ operator on a : "+a);


        //increment operator ++ > or +1
        b++;
        System.out.println("++ operator on b : "+b);

        //decrement operator -- < or -1
        a--;
        System.out.println("-- operator on a : "+a);     //it is working for decimal values also
        b--;
        System.out.println("-- operator on b : "+b);



    }
}
