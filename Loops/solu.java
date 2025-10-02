package Loops;

import java.util.Scanner;

public class solu {
    public static void main(String[] args) {
        // n= 1385758779 find out how many times 7 is occour
        
      // n=23597  revrse the number i.e ans = 79532
      /* ans :   reminder of the number * 10 + previous number ) until Loops ends

      */

    //    int num = 79532 ;
    //    int ans = 0;
    //    while ( num > 0){
    //     int rem = num % 10 ;

    //     num /=10 ;
    //     ans = ans *10 + rem ;


    //    }
    //    System.out.println(ans);

    // building a cal prograam

    Scanner in = new Scanner(System.in);
    int ans=0 ;

    //take input from user till user does not press X or x
    while (true) {
        System.out.println("ENTER YOUR OPERATOR");
        //take the operator as input
        char op = in.next().trim().charAt(0);
    if (op =='+' ||op =='-' ||op =='*' ||op =='/' ){
        System.out.println("Enter the two number");
        //input two number
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if(op =='+'){
            ans = num1 + num2 ;
        }if (op =='-') {
                ans= num1 - num2 ;
        }if (op =='*') {
                    ans= num1*num2 ;                    
                }
                if (op =='/') {
                if (num2 != 0) {
                    ans = num1/num2 ;
                }                    
                }             
                            
        
               
    } else if  (op=='x' || op=='X'){
        break;
    } else{
        System.out.println("invalid");

    }
    System.out.println("Your answer:"+ ans);

    
}
    }
}
    

