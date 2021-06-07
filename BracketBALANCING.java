import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
    // Write your code here
    Stack<Character> b=new Stack<>();
    // Boolean isBalancedd=true;
    for(int i=0;i<s.length();i++){
        char ch= s.charAt(i);
        if (ch=='(' || ch== '{' || ch== '['){
            b.push(ch);
            continue;
        }
        if(ch==')'){
            if(b.peek()=='('){
                b.pop();
            }
            else{
                return false;
                break;
            }

        }
        if(ch=='}'){
            if(b.peek()=='{'){
                b.pop();
            }
            else{
                isBalancedd=false;
                break;
            }

        }if(ch==']'){
            if(b.peek()=='['){
                b.pop();
            }
            else{
                isBalancedd=false;
                break;
            }

        }
    
    }
    if(!b.isEmpty()){
        System.out.println("Not true");
    }
    if(isBalancedd()){
        System.out.println("True");
      }
    else{
        System.out.println("Not Balanced");
    }
    

    }

}

public class BracketBALANCING {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                System.out.println(Result.isBalanced(s));

                // bufferedWriter.write(result);
                
                // bufferedWriter.newLine();

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
