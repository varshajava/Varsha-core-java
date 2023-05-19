package parameterized_constructor;

public class Student {

    String name;
    int age;
    char section;

    //we can pass different data with the help of parameterized constructor

    Student(String name,int age,char section)
    {
        this.name=name;
        this.age=age;
        this.section=section;

        /*System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("section : "+section);*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public static void main(String[] args)
    {
        Student obj=new Student("Varsha",22,'A');

        System.out.println("name : "+obj.name +" age : "+obj.age+" section : "+obj.section);

        //change name Varsha to Varsha Thakur
        obj.setName("Varsha Thakur");
        System.out.println("Name after updation : "+obj.getName());

        Student obj2=new Student("Richa",22,'B');
        System.out.println("name : "+obj2.name+" age : "+obj2.age+" section : "+obj2.section);
        //change the age  22 to 25
        obj2.setAge(25);
        System.out.println("Age after updation : "+obj2.getAge());

        Student obj3=new Student("Aroohi",23,'C');
        System.out.println("name : "+obj3.name+" age : "+obj3.age+" section : "+obj3.section);
        //change  the section C to D
        obj3.setSection('D');
        System.out.println("Section after updation : "+obj3.getSection());
    }
}
