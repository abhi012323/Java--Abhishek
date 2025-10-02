package Switche;
import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int empID = in.nextInt();

         String Department = in.next();
         switch (empID) {
            case 1:
            System.out.println("Abhishek");
                
                break;

            case 2 :
            System.out.println("Shyam");
            break;

            case 3 :
            System.out.println("Akash");
            
            switch (Department) {
            
                case "IT":
                System.out.println("IT department");
                    break;
                case "Mangement":
                System.out.println("Managemnet Department");
                break;
            
                default:
                System.out.println("enter your department");
                    
            }
            break;
         
            default:
            System.out.println("Invalid");
                
         }
    }
    
}
