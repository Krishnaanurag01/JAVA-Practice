import java.io.*;
import java.util.*;
public class JAVAbitSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        BitSet b1=new BitSet(n);
        BitSet b2=new BitSet(m);
        for (int i = 0; i <m; i++) {
            String op=sc.next();
            switch (op) {
                case "AND":
                if(sc.nextInt()==1){
                    b1.and(b2);
                }
                else{
                    b2.and(b1);
                }                   
                    break;
                
                case "OR":
                if(sc.nextInt()==1){
                    b1.or(b2);
                }
                else{
                    b2.or(b1);
                }                   
                    break;
                
                case "XOR":
                if(sc.nextInt()==1){
                b1.xor(b2);
                }
                else{
                    b2.xor(b1);
                    }                   
                break;
                case "FLIP":
                if(sc.nextInt()==1){
                    b1.flip(sc.nextInt());
                }
                else{
                    b2.flip(sc.nextInt());
                }                   
                break;
                case "SET":
                if(sc.nextInt()==1){
                b1.set(sc.nextInt());
                }
                else{
                b2.set(sc.nextInt());
                }                   
                break;
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
            if(sc.hasNextLine()){
                sc.nextLine();
            }
        }

        
        
    }
}
    

