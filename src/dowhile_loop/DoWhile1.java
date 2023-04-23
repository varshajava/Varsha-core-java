package dowhile_loop;

public class DoWhile1 {

    public static void main(String[] args) {

        //To Do :  do{CODE}

        int i=0;
        do
        {
            System.out.println("Do while loop...");
            i++;
        }
        while(i<5);




        //it always run first even if the condition is not satisfy
        System.out.println("\nWrong condition loop...");

        int a=0;
        do {
            System.out.println("Do while loop...");
            a++;
        }
        while(a>10);

        System.out.println("\nDecrement loop...\n");

        int k=10;
        do {
            System.out.println("Do while loop...");
            k--;
        }
        while(k>0);
    }
}
