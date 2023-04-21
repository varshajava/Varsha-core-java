package conditional_statements;

import java.sql.SQLOutput;

public class OROperator {
    public static void main(String[] args) {

        int marks=75;
        String name="Raj";
        //TRUE || TRUE =TRUE
        if(name=="Raj" || marks>60)
        {
            System.out.println("Raj pass out with first division...");
        }
        else
        {
            System.out.println("Raj did not pass out with first division...");
        }

        //TRUE || FALSE =TRUE ,1 +0=1
        marks=50;

        if(name=="Raj" || marks>60)
        {
            System.out.println("Raj pass out with first division...");
        }
        else
        {
            System.out.println("Raj did not pass out with first division...");
        }

        //FALSE || TRUE =TRUE
        name="Richa";
        if(name=="Raj" || marks==50)
        {
            System.out.println("Raj pass out with first division...");
        }
        else
        {
            System.out.println("Raj did not pass out with first division...");
        }

        //FALSE || FALSE =FALSE
        marks=20;
        name="Jiya";
        if(name=="Raj" || marks>60)
        {
            System.out.println("Raj pass out with first division...");
        }
        else
        {
            System.out.println("Raj did not pass out with first division...");
        }

    }

    public void sum() {
    }
}
