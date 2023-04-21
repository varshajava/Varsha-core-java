package conditional_statements;

public class ProtectedClass {

    private int a=40;
    private int b=20;
    int add=a+b;

    public void addition()
    {
        System.out.println("sum = "+add);
    }






    public static void main(String[] args) {
        ProtectedClass obj1=new ProtectedClass();
        obj1.addition();
        System.out.println("a is : "+obj1.a);




    }

}
