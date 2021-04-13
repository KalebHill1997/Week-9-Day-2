package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int x = 3;
        while(x != 0){
            Scanner theScanner = new Scanner(System.in);
            System.out.print("what animal u want?: ");
            String animal = theScanner.nextLine();

            if (animal.equals("dog"))
                System.out.println("woof");
            else if (animal.equals("cat"))
                System.out.println("meow");
            else if (animal.equals("cow"))
                for (int i = 1; i <= 5; i++)
                    System.out.println("moo");
            else if (animal.equals("fox"))
                System.out.println("ring ding ding ding ding ding ding ding ding ra ta ta ta ta ta ta ");
            else
                System.out.println("man idk");

            System.out.print("\nDo you want to quit? Press \n" +
                    "0 to quit, any other NUMBER to continue: ");
            x = theScanner.nextInt();
        }
        System.out.println("exited successfully");
    }
}
