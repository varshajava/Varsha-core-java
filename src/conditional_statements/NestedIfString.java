package conditional_statements;

public class NestedIfString {
    public static void main(String[] args) {

        String country="USA";
        int pop=100;

        if(country=="India")
        {
            if(pop>=100)
            {
                System.out.println("High Configuration");
            }
            else
            {
                System.out.println("population under control");
            }
        }
        else
        {
            System.out.println("invalid country "+country);
        }

    }
}
