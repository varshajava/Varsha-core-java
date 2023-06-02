package methods;

public class Book {

    String name;
    int pages;
    String writerName;

 // TODO access specifier  returnType MethodName(parameter){code}
    public void readMethod()
    {
        System.out.println("This is read method...");
    }

    public void writeMethod()
    {
        System.out.println("This is write method...");
    }

    public static void main(String[] args)
    {
        Book obj=new Book();
        obj.readMethod();
        obj.writeMethod();

    }

}
