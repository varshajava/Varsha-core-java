package loop.for_loop.dowhile_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoOdd {

    public static void main(String[] args) throws IOException {

        InputStreamReader varsha=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(varsha);

        System.out.println("enter any number : ");
        int n=Integer.parseInt(br.readLine());

        int a=50;
        do{
            if(a%2!=0)
            {
                System.out.println(a+" ");
            }
            a++;
        }
        while(a<=n);
    }
}
