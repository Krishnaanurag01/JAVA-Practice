import java.util.Scanner;

public class NnumbersSUMusingRECURSION {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        System.out.println(summ(m));
    }
    public static int summ(int n){
        if(n==1){
        return 1;
        }
        return n+summ(n-1);


    }

    
}