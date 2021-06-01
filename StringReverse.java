import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        //                            Method-01
        // String rev ="";
        // char strarr[]= A.toCharArray();
        // for(int i=A.length()-1;i>=0;i--){
        //     rev+=strarr[i];
        // }
        // // System.out.print(rev);        
        // System.out.println(A.equals(rev) ? "Yes":"No");
        /* Enter your code here. Print output to STDOUT. */
        
        //              Method-02 (Better version)
        // String r = new StringBuilder(A).reverse().toString();
        // System.out.print(A.equals(r)?"Yes":"No");
        
        // method-03 the best way
        
        System.out.print(A.equals(new StringBuilder(A).reverse().toString())?"Yes":"No");
    }
}



