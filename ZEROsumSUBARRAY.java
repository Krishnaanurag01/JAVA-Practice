import java.util.HashSet;
import java.util.Set;

public class ZEROsumSUBARRAY {
    public static void main(String[] args) {
        int[] arr={2,2,1,4,3};
        Set<Integer> set=new HashSet<>();
        int sum=0;
        boolean found=false;
        for (Integer integer : arr) {
            set.add(sum);
            sum+=integer;
            if (set.contains(sum)) {
                found=true;
                break;
            }
        }
        System.out.println(found);
    }
    
}
