package loop.for_loop;

public class DemoLoop {
    public static void main(String[] args) {
//Printing hello with the help of loop 5 times
  /*To do for(initialization;condition;increment/decrement)
        {
            body of loop
        }*/

        for(int i=0;i<5;i++)
        {
            System.out.println("Hello "+i);
        }

        // TODO for(initialization; condition; decrement ){
//            statement or code to be executed

        System.out.println("Decrement loop ");
//                }

        for(int i=5;i>0;i--)
        {
            System.out.println("Hello : "+i);
        }
    }
}
