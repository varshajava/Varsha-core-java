package conditional_statements;

public class NestedIfElse3 {
    public static void main(String[] args) {

        int marks=72;
        String section="Science";
        if(marks>=33)
        {
            if(section=="Art")
            {
                System.out.println("passed with Art ");
            }
            else
            {
                System.out.println("passed with Science");
            }

        }
        else
        {
            if(section=="Art")
            {
                System.out.println("fail with Art");
            }
            else
            {
                System.out.println("fail with Science");
            }
        }
    }
}
