package Function;

public class str {
    public static void main(String[] args) {
        String ans = myGreet("Abhishek");
        System.out.println(ans);
        
    }
    static String greet(){
        String greeting = "How are you" ;
        return greeting ;
    }
    
    static String myGreet(String name){
        String personal = "Hello" +""+ name ;
        return personal;
    }
}