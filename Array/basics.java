package Array;

import Function.scope;

public class basics {
    //arrays are collections of data types.Whatever datatype we have we can store in it
    public static void main(String[] args) {
        //syntax
        //datatype[] varibale_name = new datatype[size];

        //by each ref variable if any value is not assign its by default null
        // int[] arr = new int[5];
        // arr[0]= 23;
        // arr[1]= 234;
        // arr[2]=22;
        // arr[3]= 34;
        // arr[4]=54324;
        // System.out.println(arr[4]);

        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i]= in.next();
            
        }
        System.out.println(Array.toString(str));

 }

    
}