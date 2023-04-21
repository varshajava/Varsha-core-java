package conditional_statements;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class DemoIf {
    public static void main(String[] args) {





        // TODO if(CONDITION){CODE}

        int age=9;

        if(age>18)
        {
            System.out.println("Person is eligible for voting");
        }

        if(age<18)
        {
            System.out.println("person is child so not eligible for voting");
        }

        String city="DELHI";

        if(city=="AGRA")
        {
            System.out.println("person belongs to AGRA");
        }


    }
}
