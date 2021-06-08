import java.util.*;
public class ArrayDEQUEUE {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // Deque deque = new ArrayDeque<>();
            Set<Integer> set=new HashSet<>();
            int n = in.nextInt();
            int m = in.nextInt();

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                set.add(num);
               
            }
            System.out.println(set.size());
        }
    }