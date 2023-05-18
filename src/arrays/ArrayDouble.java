package arrays;

public class ArrayDouble {

    public static void main(String[] args) {

        double height[] = {5.5, 6.8, 7.8, 8.9, 6.0, 4.0, 3.8};

        System.out.println("marks at given index is : " + height[3]);
        System.out.println();


        for (int i = 0; i < height.length; i++) {
            System.out.println("For loop : " + height[i]);
        }
        System.out.println();

        int i = 0;
        while (i < height.length) {
            System.out.println("While loop : " + height[i]);
            i++;
        }

        System.out.println();


        for (double var : height) {
            System.out.println("for each loop : " + var);
        }
    }
}
