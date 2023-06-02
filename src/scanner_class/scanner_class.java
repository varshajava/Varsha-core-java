package scanner_class;

import java.util.Scanner;


//program to print all the data types by asking input from user
public class scanner_class {

    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);

        System.out.println("Enter age : ");
        int age=obj.nextInt();

        System.out.println("Enter height : ");
        double height=obj.nextDouble();

        System.out.println("Enter gender : ");
        char gender=obj.next().charAt(0);

        System.out.println("Enter word : ");
        String word=obj.next();



        System.out.println("Enter String : ");
        Scanner obj2=new Scanner(System.in);
        String name= obj2.nextLine();

    }
}
