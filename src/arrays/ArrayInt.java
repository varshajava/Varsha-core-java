package arrays;

public class ArrayInt {

    public static void main(String[] args) {

        int marks [] = {55,68,78,89,90,40,98};

        System.out.println("marks at given index is : "+marks[3]);
        System.out.println();


        for(int i=0;i<marks.length;i++)
        {
            System.out.println("For loop : "+marks[i]);
        }
        System.out.println();

        int i=0;
        while(i<marks.length)
        {
            System.out.println("While loop : "+marks[i]);
            i++;
        }

        System.out.println();




        for(int var : marks)
        {
            System.out.println("for each loop : "+var);
        }
    }
}
