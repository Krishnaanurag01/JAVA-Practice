import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class JavaPrimalityTEST  {
        public static void main(String[] args) {
            Scanner sc= new Scanner (System.in);
            //           1st method
            BigInteger b1=sc.nextBigInteger();
            //               2nd method
            // String n=sc.next();
            // BigInteger b1=new BigInteger(n);
            sc.close();
            System.out.println(b1.isProbablePrime(6)?"prime":"not prime");
        }
    }
    
    
