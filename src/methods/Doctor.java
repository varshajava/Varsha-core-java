package methods;

public class Doctor {

    String name;
    int fee;
    String spec;

    public void visitMethod()
    {
        System.out.println("Visit will be on every monday...");
    }
    void checkupMethod()
    {
        System.out.println("Full check up will be at the end of the month...");
    }

    public static void main(String[] args)
    {
        Doctor obj=new Doctor();
        obj.visitMethod();
        obj.checkupMethod();
    }

}
