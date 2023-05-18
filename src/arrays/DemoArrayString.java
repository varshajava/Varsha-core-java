package arrays;

public class DemoArrayString {

    public static void main(String[] args) {

        String  city1="Pune";
        String city2="Mumbai";
        String city3="Jaipur";
        String city4="Bangalore";
        String city5="Agra";
        String city6="Delhi";

        //TODO Datatype varName []={value1,value2,value3,value4.....valueN};

        String cities []={"Pune","Mumbai","Jaipur","Bangalore","Agra","Delhi"};

        //TODO varName[index]

        System.out.println("printing 2 index value in array : "+cities[2]);
        System.out.println("printing 4 index value in array : "+cities[4]);
        System.out.println("printing 0 index value in array : "+cities[0]);


        System.out.println("printing array with loop");

        for(int i=0;i<cities.length;i++)    //instead of using end loop number ,use predefined method
        {
            System.out.println(cities[i]);
        }
        System.out.println("\nlength of array is : "+cities.length);

        //while loop

        int i=0;
        while(i< cities.length)
        {
            System.out.println("While loop : "+cities[i]);
            i++;
        }

        //Advance for loop
        //TODO for(Datatype varName : ArrayName){code}

        System.out.println("Advance for loop ...\n");

        for(String var : cities)
        {
            System.out.println("array is : "+var);
        }

    }
}
