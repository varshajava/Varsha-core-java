package conditional_statements;

import conditional_statements.ProtectedClass;

public class DemoVariable extends ProtectedClass {

    public static void main(String[] args) {


        String cityName="Agra";
        String phoneno="9897508419";     //  here we have taken phone no in string instead of int b'coz it has long range nd int has short range

        //long num=4454432322;

        System.out.println("My city name is : "+cityName);
        System.out.println("My phone number is : "+phoneno);
        //System.out.println("number is equal to "+num);


        int age=22;
        double salary=45540.95;

        System.out.println("My age is : "+age);
        System.out.println("My salary is approximately "+salary);

        ProtectedClass obj=new ProtectedClass();
        obj.addition();

    }

}
