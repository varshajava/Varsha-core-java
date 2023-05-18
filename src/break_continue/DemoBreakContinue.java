package break_continue;

public class DemoBreakContinue {
    public static void main(String[] args) {

        //The break keyword is used to break out a for loop, a while loop or a switch block.


        for (int a = 1; a <= 10; a++) {

            /*if(a==3) {
                break;
            }*/
            System.out.println("Break keyword use :" + a);
            if (a == 3 || a==2) {
                break;
            }


        }
        System.out.println("*********************************");

        for(int a=1;a<=10;a++)
        {
            if(a==5)
            {
                continue;
            }
            System.out.println("Continue keyword : "+a);
        }
    }
}
