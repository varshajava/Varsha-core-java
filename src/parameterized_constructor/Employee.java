package parameterized_constructor;

public class Employee {

    String name;
    double salary;
    String dept;

    public Employee(String name,double salary,String dept)
    {
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public static void main(String [] args)
    {
        Employee obj=new Employee("Prakhar",50000,"CS");
        System.out.println("name : "+obj.name+" salary : "+obj.salary+" dept : "+obj.dept);
        //changing name from Prakhar to Prakhar Thakur
        obj.setName("Prakhar Thakur");
        System.out.println("Name after an update : "+obj.getName());

        Employee obj2=new Employee("Ishan",80000,"EC");
        System.out.println("name : "+obj2.name+" salary : "+obj2.salary+"dept : "+obj2.dept);
        //changing salary from 80000 to 10000
        obj2.setSalary(10000);
        System.out.println("Salary after an update : "+obj2.getSalary());

        Employee obj3=new Employee("Mahira",70000,"ME");
        System.out.println("name : "+obj3.name+" salary : "+obj3.salary+" dept : "+obj3.dept);
        //changing dept from ME to CS
        obj3.setDept("CS");
        System.out.println("Department after an update : "+obj3.getDept());


    }
}
