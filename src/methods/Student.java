package methods;

public class Student {

    String name;
    int age;
    String section;

    void playMethod()
    {
        System.out.println("This is play method...");
    }

    void studyMethod()
    {
        System.out.println("This is study method...");
    }

    public static void main(String[] args) {

        //object
        Student obj=new Student();

        //calling method    objName.MethodName();

        obj.playMethod();
        obj.studyMethod();
    }
}
