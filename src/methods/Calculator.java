package methods;

public class Calculator {

    public void addition() {

        int n1 = 30;
        int n2 = 20;
        int add = n1 + n2;
        System.out.println("Addition is : " + add);
    }
    public void subtraction()
    {
        int n1 = 40;
        int n2 = 25;
        int sub = n1-n2;
        System.out.println("Subtraction is : "+sub );
    }
    public void multiplication()
    {
        int n1 = 25;
        int n2 = 2;

        int mul = n1*n2;
        System.out.println("Multiplication is : "+mul);
    }

    public void division()
    {
        int n1 = 30;
        int n2 = 9;
        double div = (double)n1/n2;
        System.out.println("Division is : "+div);
    }

    public void modulus()
    {
        int n1 = 95;
        int n2 = 15;
        int mod = n1%n2;
        System.out.println("Modulus : "+mod);
    }

    public static void main(String[] args) {

    Calculator obj = new Calculator();
    obj.addition();
    obj.subtraction();
    obj.multiplication();
    obj.division();
    obj.modulus();









    }
}
