package loop.for_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForEven {

    public static void main(String[] args) throws IOException {



        InputStreamReader varsha=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(varsha);

        System.out.println("enter any number : ");
        int n=Integer.parseInt(br.readLine());

        for(int a=1;a<=n;a++)
        {
            if(a%2==0)
            {
                System.out.print(a+" ");
            }
        }
    }
}
