package methods;

public class CalcReturnType {

    public int addition(int a,int b)
    {
        int add=a+b;
        return add;
    }
    public int subtract(int a,int b)
    {
        int sub=a-b;
        return sub;

    }

    public int multiply(int a,int b)
    {
        int mul=a*b;
        return mul;
    }

    public double divide(int a,int b)
    {
        double div=(double)a/b;
        return div;
    }



    public static void main(String[] args) {
        CalcReturnType obj=new CalcReturnType();

        int result1=obj.addition(32,48);
        System.out.println("addition is : "+result1);

        int result2=obj.subtract(35,38);
        System.out.println("subtraction is : "+result2);

        int result3=obj.multiply(8,19);
        System.out.println("multiplication is : "+result3);

        double result4=obj.divide(56,3);
        System.out.println("division is : "+result4);

    }
}
