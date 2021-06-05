import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList[] arrayLists = new ArrayList[20000];
        for (int i = 0; i < n; i++) {
            arrayLists[i] = new ArrayList<>();
            int m=sc.nextInt();
            for (int j = 0; j < m; j++) {
                int k=sc.nextInt();
                arrayLists[i].add(k);
            }
        }

        int q=sc.nextInt();
        for (int i = 0; i <q; i++) {
            int row= sc.nextInt();
            int col=sc.nextInt();
            try{
                System.out.println(arrayLists[row-1].get(col-1));
        }
        catch(Exception e){
            System.out.println("ERROR!");
        }
        }
        sc.close();
    }
}