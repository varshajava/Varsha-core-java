package break_continue;

public class ContinueT {

    public static void main(String[] args) {

        int num=3;
        int a=1;
        while(a<=10)
        {
            int output=num*a;
            if(output==27)
            {
                a++;
                continue;
            }

            System.out.println(num+"X"+a+"="+output);
            a++;

        }
    }
}
