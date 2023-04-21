package conditional_statements;

public class NestedIfElse {
    public static void main(String[] args) {

        int number=0;
        if(number!=0)
        {
            if(number%2==0)
            {
                System.out.println("Even number : "+number);
            }
            else
            {
                System.out.println("Odd number : "+number);
            }
        }
        else
        {
            System.out.println("number is invalid");
        }
    }
}
