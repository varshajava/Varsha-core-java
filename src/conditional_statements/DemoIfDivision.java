package conditional_statements;

public class DemoIfDivision {
    public static void main(String[] args) {

        int marks=30;

        if(marks>70)
        {
            System.out.println("First Division");
        }
        if(marks>50 && marks<70 )
        {
            System.out.println("Second Division");
        }
        if(marks>=30 && marks<50)
        {
            System.out.println("Third Division");
        }
        if(marks<30)
        {
            System.out.println("Fail");
        }

    }
}
