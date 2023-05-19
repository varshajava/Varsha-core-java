package class_and_objects;

public class Student {

    String name="Sahil Garewal";
    int standard=4;
    int age=14;
    char sec='B';

    public static void main(String[] args) {

        Student obj=new Student();

        System.out.println("name : "+obj.name);
        System.out.println("standard : "+obj.standard);
        System.out.println("age : "+obj.age);
        System.out.println("section : "+obj.sec);
    }

}
