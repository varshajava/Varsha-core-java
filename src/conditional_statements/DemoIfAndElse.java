package conditional_statements;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class DemoIfAndElse {

    public static void main(String[] args) {

        int age=18;

        if(age>18)
        {
            System.out.println("person is eligible for voting");
        }
        else     //  age<=18
        {
            System.out.println("person is child so not eligible for voting ");
        }

        String city="AGRA";

        if(city=="DELHI")
        {
            System.out.println("person belongs to AGRA");
        }
        else
        {
            System.out.println("person does not belong to Agra ");
        }

    }
}
