package switch_case;

public class SwitchMonth {
    public static void main(String[] args) {

        char month='d';

        switch(month)
        {
            case 'a':
                System.out.println("January");
                break;
            case 'b':
                System.out.println("February");
                break;
            case 'c':
                System.out.println("March");
                break;
            case 'd':
                System.out.println("April");
                break;
            case 'e':
                System.out.println("May");
                break;
            case 'f':
                System.out.println("June");
                break;
            case 'g':
                System.out.println("July");
                break;
            case 'h':
                System.out.println("August");
                break;
            case 'i':
                System.out.println("September");
                break;
            case 'j':
                System.out.println("October");
                break;
            case 'k':
                System.out.println("November");
                break;
            case 'l':
                System.out.println("December");
                break;
            default :
                System.out.println("Not exist in the given category");
        }
    }
}
