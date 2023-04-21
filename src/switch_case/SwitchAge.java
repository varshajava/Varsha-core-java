package switch_case;

public class SwitchAge {
    public static void main(String[] args) {

        int age=17;
        switch(age)
        {
            case 10:
            {
                System.out.println("Child");
                break;
            }
            case 18:
            {
                System.out.println("Young");
                break;
            }
            case 25:
            {
                System.out.println("Adult");
                break;
            }
            case 60:
            {
                System.out.println("Old");
                break;
            }
            default :
            {
                System.out.println("Age category does not exist");
            }

        }

    }
}
