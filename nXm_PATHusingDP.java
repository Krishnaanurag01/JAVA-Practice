import java.util.Scanner;

public class nXm_PATHusingDP {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("total paths : " + path(n.nextInt(),n.nextInt()));
    }
    public static int path(int x,int y){
        if(x==1||y==1)return 1;
        return path(x,y-1)+path(x-1,y);
    }
}
