package methods;

public class MethodReturnType {


    public String passingName(String name)
    {
        String output="Welcome to Java Programming..."+name;
        return    output;
    }
    //create square of number

    public int makeSquare(int num)
    {
        int output=num*num;
        return output;
    }

    //doubling the price
    public double priceDouble(double price)
    {
        double output=price*2;
        return output;
    }



    public static void main(String[] args)
    {
        MethodReturnType obj=new MethodReturnType();
        String result=obj.passingName("Natasha Mehra");  //Storing the output
        System.out.println(result);

        int result2=obj.makeSquare(8);
        System.out.println("Square of number is : "+result2);

        double result3=obj.priceDouble(500);
        System.out.println("Doubled price is : "+result3);


    }
}
