package Function;

public class overloading {
    
    //if the functions are same and arg are different then its overlaod the function
    public static void main(String[] args) {
        fun(2);
        fun("Abhi");
        
    }

static void fun(int a){

    System.out.println(a);
}

static void fun(String name){
    System.out.println(name);

}
}
