import java.util.Scanner;

public class ReverseingAstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ne=sc.nextLine();
        sc.close();
        String arr[]=ne.split(" ");
        for (int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
            
        }
        // System.out.println(new StringBuilder(ne).reverse().toString());
    }   
}