package logical_programs;

public class PrimeN0 {
    public static void main(String[] args) {

        int num=5;
        int richa=0;
        for(int a=1;a<=num;a++)
        {
            if(num%a==0)
            {
                richa++;
            }

        }
        if(richa==2)
        {
            System.out.println("Prime no");
        }
        else
        {
            System.out.println("Non prime no");
        }
    }
}
