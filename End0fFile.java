import java.util.*;

public class End0fFile {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){
        System.out.println(i+ " " + sc.nextLine());
        i++ ;
        }
        sc.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}