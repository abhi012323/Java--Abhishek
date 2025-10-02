package Function;

public class demo {
public static void main(String[] args) {
    //primitive : int,str,sort,char,byte ===on;y values will be passed
//     Implement console program which will meet the following requirements:

// Program can be started in ‘admin’ and ‘guest’ mode

// To start program in ‘admin’ mode any of multiple string arguments should be equal to ‘--admin’

// To start program in ‘guest’ mode any of multiple string arguments should be equal to ‘--guest’

// Program cannot be started with ‘--admin’ and ‘--guest’ arguments simultaneously

// If program is started in ‘admin’ mode then "Hello, Admin!" is printed to console

// If program is started in ‘guest’ mode then "Hello, Guest!" is printed to console

// If program is started with ‘--admin’ and ‘--guest’ arguments then program prints "Please, select either 'ADMIN' or 'GUEST' mode for this program" to console

boolean isAdmin = false ;
boolean isGuest = false ;

//loop through all command-line agr

for (String arg : args){
    if(arg.equals("---admin")){
        isAdmin = true ;
    }
    if( arg.equals("---guest")){
        isGuest = true ;
    }


}
//check condition
if( isAdmin && isGuest){
    System.out.println("Please Select either 'ADMIN' or 'GUEST'");
}else if (isAdmin) {
    System.out.println("Hello Admin!");
    
}else if (isGuest) {
    System.out.println("Hello Guest");
    
}else{
    System.out.println("Please Selct either 'ADMIN' or 'GUEST' " );
}


}    
}
