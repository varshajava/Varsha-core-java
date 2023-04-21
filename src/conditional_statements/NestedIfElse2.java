package conditional_statements;

public class NestedIfElse2 {
    public static void main(String[] args) {


        int age=17;
        String city="Delhi";
        if(age>=18)
        {
            if(city=="Delhi" || city=="Banglore" || city=="Mumbai" || city=="Chennai")
            {
                System.out.println("Metro city");
            }
            else
            {
                System.out.println("Not a Metro city");
            }
        }
        else
        {
            System.out.println("invalid age");
        }

    }
}
