import java.util.Scanner;

public class POWERusingRECURSION {
    static int ab=0;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // System.out.println(topower(sc.nextInt(),sc.nextInt()));
        System.out.println(fastpower(sc.nextInt(),sc.nextInt()));
        System.out.println(ab);

    }
    // public static int topower(int a,int b){
    //     if(b==0){
    //         return 1;
    //     }
    //     return a*topower(a,b-1);
    // }
    public static int fastpower(int a,int b){
        ab++;
        if(b==0){
            return 1;
        }
        if(b%2!=0){
            return a*fastpower(a, b-1);
        }
        return fastpower(a*a, b/2);
    }
}
