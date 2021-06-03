import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger b1=new BigInteger(sc.next());
        BigInteger b2=new BigInteger(sc.next());
        
        
        // BigInteger b3=b1.add(b2);
        // BigInteger b4=b1.multiply(b2);
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
        sc.close();
        
                
    }
}

    
