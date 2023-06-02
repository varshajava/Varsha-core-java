package methods;

public class MethodParameter {


    public void checkAge( int age)
    {


        if(age<18)
        {
            System.out.println("Person is child...");
        }
        else if(age>18 && age<45)
        {
            System.out.println("Person is young...");
        }
        else
        {
            System.out.println("Person is old...");
        }
    }

    public void hello(String name)
    {
        System.out.println("Welcome to Java..."+name);
    }

    public void method3(String name,int age,double salary)
    {
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
        System.out.println("Salary is : "+salary);

    }


    public static void main(String[] args) {

        MethodParameter obj=new MethodParameter();
        obj.checkAge(15);
        obj.hello("Varsha Thakur");
        obj.method3("Ishan Khandelwal",23,45000.00);


    }
}
