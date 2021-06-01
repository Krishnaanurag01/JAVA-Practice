import java.util.*;

class StarPattern01 {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int k = 1; k <=i ; k++) {
                System.out.print(" ");
                
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}
