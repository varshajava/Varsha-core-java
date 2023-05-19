package class_and_objects;

public class Doctor {

    //data members

    String name="Alok Agrawal";
    int fee=500;
    double salary=50000.0;

    public void docMethod()
    {

    }

    public static void main(String[] args) {

        //TODO classname objName=new className();   OBJECT CREATION


        Doctor obj=new Doctor();
        System.out.println("Name is : "+obj.name);
        System.out.println("fee : "+obj.fee);
        System.out.println("salary : "+obj.salary);


    }

}
