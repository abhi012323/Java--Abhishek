package Demo;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //  int a = input.nextInt();
        //  int b = input.nextInt();
        //  int sum = a + b ;
        //  System.out.println("sum :" + sum);

        byte b = 42 ;
        char c = 'a' ;
        short s = 1024 ;
        int i = 50000;
        float f = 5.67f ;
        double d = 0.1234 ;
        double result = (f*b) + (i/c) -(d * s);
        
        System.out.println((f*b) + " " + (i/c)+ " " + (d*s));
    }
    
}
