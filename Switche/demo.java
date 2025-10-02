package Switche;

import java.util.Scanner;

public class demo {
    /**
     * @param args
     */
    public static void main(String[] args) {

        /* tke a input Fruit and print if mnago --season food,graps= small fruit
         */
        Scanner in = new Scanner(System.in);

        //  String Fruit = in.next();

        //  switch (Fruit) {
        //     case "Mango":
        //     System.out.println("fav");
        //     break;
        //     case "graps":
        //     System.out.println("sweet");
                
        //         break;
         
        //     default:
        //     System.out.println("Enter your fruits");
        //     break;
            
        //  }

        //  int day = in.nextInt();
        //  switch (day) {
        //     case 1:
        //     System.out.println("Monday");
        //     break;
        //     case 2:
        //     System.out.println("tuesday");
        //     break;
        //     case 3:
        //     System.out.println("Wednesday");
        //     break;
         
        //     default:
        //     System.out.println("Enter youur number");
        //         break;
        //  }
        int day = in.nextInt();
        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekend");      
              }
}
}