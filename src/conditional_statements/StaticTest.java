package conditional_statements;

public class StaticTest {

    static int a=20;
    static int b=20;

    static void sum()
    {
        int sum=a+b;
        System.out.println("sum is : "+sum);
    }
    void sub() {
        int sub = a - b;
        System.out.println("sub is : " + sub);
    }
    public static void main(String[] args) {


        StaticTest obj=new StaticTest();
        obj.sum();
        System.out.println("a is : "+obj.a);
        sum();
         System.out.println("a is : "+ StaticTest.a);

    }
}
