package conditional_statements;

public class NOTOperator {

    public static void main(String[] args) {

        int age=21;

        if(!(age>=18))
        {
            System.out.println("Eligible for voting...");
        }
        else
        {
            System.out.println("Not Eligible for voting...");
        }

        String city="AGRA";

        if(!(age>18 && city=="AGRA"))
        //if(!(age>18 )&& city=="AGRA")
        {
            System.out.println("Eligible for voting in AGRA...");
        }
        else
        {
            System.out.println("Not eligible for voting in AGRA...");
        }
        int ram=4;
        String brand="mac";
        int ssd=556;
        if(!(ram>=2 && brand=="mac" || ssd<=555))
        {
            System.out.println("good specification");
        }
        else
        {
            System.out.println("bad specification");
        }
        int distance=100;
        double temp=41.2;
        if(!(distance>=100 || temp>41))
        {
            System.out.println("Long distance");
        }
        else
        {
            System.out.println("Normal distance");
        }
    }
}
