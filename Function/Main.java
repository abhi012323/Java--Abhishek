import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        
        // Sum();

        //pass the value in main i.e a & b
        int ans = sum2(20,30);
        System.out.println(ans);
        
    } 
    // Pass the value of number when you're calling the parameter:
     static int sum2(int a,int b){
        int sum = a + b ;
        return sum ;
     }

//build the function of sum of two interger ;;
// static  void Sum(){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter number 1");
//     int a = sc.nextInt();

//     System.out.println("Enter number 2 :");
//     int b  = sc.nextInt();

//     int sum = a + b ;

//     System.out.println("Sum of two numbers: " + sum);

// }


//return int ;
static int Sum1(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number 1");
    int a = sc.nextInt();

    System.out.println("Enter number 2 :");
    int b  = sc.nextInt();

    int sum = a + b ;

    return sum ;
}
    
}


