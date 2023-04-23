package dowhile_loop;

public class Table5 {

    public static void main(String[] args) {

        int number=5;
        int a=1;

        do
        {
            int output=number*a;
            System.out.println("Table 5 is : "+number+"X"+a+"="+output);
            a++;
        }
        while(a<=10);

    }
}
