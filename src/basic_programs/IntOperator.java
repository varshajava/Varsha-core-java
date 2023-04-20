//WAP to use all operators by using integer datatype


package basic_programs;

public class IntOperator {
    public static void main(String[] args) {

        int a=9;
        int b=2;

        System.out.println("first number is : "+a);
        System.out.println("Second number is : "+b);

        // find square of given number : number*number

        int square=a*a;


        System.out.println("Square is : "+square);

        int sqa=b*b;

        System.out.println("Square is : "+sqa);


        //  find the sum of two numbers : a+b
        //Addition

        int sum=a+b;

        System.out.println("sum of a and b is : "+sum);

        //Subtraction

        int sub=a-b;
        System.out.println("subtraction of a and b is : "+sub);

        //Multiplication
        int mul=a*b;

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
        System.out.println("-- operator on a : "+a);
        b--;
        System.out.println("-- operator on b : "+b);
    }
}
