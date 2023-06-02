package methods;

public class CalcWithParameter {

    public void addition(int a,int b)
    {
        int add=a+b;
        System.out.println("Addition is : "+add);
    }

    public void subtract(int a,int b)
    {
        int sub=a-b;
        System.out.println("Subtraction is : "+sub);
    }

    public void multi(int a,int b)
    {
        int mul=a*b;
        System.out.println("Multiplication is : "+mul);
    }
    public void divide(int a,int b)
    {
        double div=(double)a/b;
        System.out.println("Division is : "+div);
    }

    public void modulus(int a,int b)
    {
        int mod=a%b;
        System.out.println("Modulus is : "+mod);
    }



    public static void main(String[] args)
    {
        CalcWithParameter obj=new CalcWithParameter();
        obj.addition(40,20);
        obj.subtract(30,12);
        obj.multi(5,4);
        obj.divide(57,8);
        obj.modulus(50,5);
    }
}
