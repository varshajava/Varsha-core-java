package conditional_statements;

public class ANDOperator {
    public static void main(String[] args) {

        //TODO if (condition1 operator condition2 operator condition3.....)
        //TRUE & TRUE= TRUE (1X1=1)


        String brand_name="Lenovo";
        int ram=8;
        if(brand_name=="Lenovo" && ram==8)
        {
            System.out.println("Good configuration");
        }
        else
        {
            System.out.println("Bad Configuration");
        }

        //TRUE & FALSE=FALSE(1X0=0)


        ram=4;
        if(brand_name=="Lenovo" && ram==8)
        {
            System.out.println("Good configuration");
        }
        else
        {
            System.out.println("bad configuration");

        }
        //FALSE& TRUE =FALSE(0X1=0)



        brand_name="Dell";
        if(brand_name=="Lenovo" && ram==8)
        {
            System.out.println("Good configuration");
        }
        else
        {
            System.out.println("bad configuration");

        }
        //FALSE&FALSE= FALSE(0X0=0)
        brand_name="lenovo";
        ram=6;
        if(brand_name=="Asus" && ram==4)
        {
            System.out.println("Good configuration");
        }
        else
        {
            System.out.println("bad configuration");

        }




    }
}
