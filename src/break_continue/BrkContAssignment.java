package break_continue;

public class BrkContAssignment {

    public static void main(String[] args) {

        for(int a=1;a<=10;a++)
        {
            if(a==3 || a==9)
            {
                continue;
            }
            System.out.println("NUMBERS are : "+a);
        }


        System.out.println("\nEven numbers are....");

        for(int i=1;i<=50;i++)
        {


                if (i % 2 == 0) {
                    System.out.println(i);

                }
                if(i>20)
                {
                    break;
                }

        }
    }
}
