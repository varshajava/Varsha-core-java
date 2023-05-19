package class_and_objects;


public class Engineer {

    String name="Ritvik Kapoor";
    String stream="CSE";
    double salary=60000.0;



    public static void main(String[] args) {

        //TODO classname objName=new className();   OBJECT CREATION

        Engineer obj=new Engineer();
        System.out.println("NAME : "+obj.name);
        System.out.println("STREAM : "+obj.stream);
        System.out.println("SALARY : "+obj.salary);

        Engineer obj2=new Engineer();

        System.out.println("Name : "+obj2.name);
        System.out.println("Stream : "+obj2.stream);
        System.out.println("Salary : "+obj2.salary);
    }
}
