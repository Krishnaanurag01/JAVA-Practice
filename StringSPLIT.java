import java.io.*;
import java.util.*;
public class StringSPLIT {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        scan.close();
        if(s.length()>0){
            String arr[]=s.split("[ !,?._'@]+");
        System.out.println(arr.length);
        for(String i :arr){
            System.out.println(i);
        }
            
        }
        else{
            System.out.print("0");
        }
        
    }
}


