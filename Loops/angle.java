import java.util.Scanner;

public class Angle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
		int a = sc.nextInt();
		
		
		System.out.print("Please, enter B side of a triangle: ");
		int b = sc.nextInt();
		
		System.out.print("Please, enter C side of a triangle: ");
		int c = sc.nextInt();
		
		if( a>0 && b>0 && c>0 && a+b>c && b+c> a && c+a>b){
		    double p = (a+b+c)/2.0;
		    double triangleArea = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		    
	
		System.out.println("Triangle area is: " + triangleArea);
		
	} else {
	    System.out.println("NaN");
	}
	sc.close();

}
}
