package conditional_statements;

public class OROperator2 {
    public static void main(String[] args) {

     double height=5.5;
     int weight=59;
     if(height==5.5 || weight>=58)
     {
         System.out.println("good physics");
     }
     else
     {
         System.out.println("bad physics");
     }
     weight=57;
     if(height>5.4 || weight>=58)
     {
         System.out.println("good physics");
     }
     else
     {
         System.out.println("bad physics");
     }
     height=5.4;
        if(height>5.4 || weight>=57)
        {
            System.out.println("good physics");
        }
        else
        {
            System.out.println("bad physics");
        }
        height=5.5;
        weight=54;
        if(height<5.4 || weight>=58)
        {
            System.out.println("good physics");
        }
        else
        {
            System.out.println("bad physics");
        }

    }
}
