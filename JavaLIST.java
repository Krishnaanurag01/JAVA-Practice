import java.util.*;
public class JavaLIST {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       List<Integer> arr = new ArrayList<Integer>(n);
       for(int i=0;i<n;i++){
           arr.add(i,sc.nextInt());
       }
    //    for(int i=0;i<n;i++){
    //        System.out.print(arr.get(i)+" ");
    //    }
    int q=sc.nextInt();
    for(int i=0;i<q;i++){
        String op=sc.next();
        if(op.equals("Insert")){
            // int index=sc.nextInt();
            // int value=sc.nextInt();
            arr.add(sc.nextInt(), sc.nextInt());
        }
        if(op.equals("Delete")){
            // int index=sc.nextInt();
            arr.remove(sc.nextInt());
        }
    }
    for(Integer i : arr){
        System.out.print(i+" ");
    }
    }
}
    
