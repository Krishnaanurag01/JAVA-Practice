import java.util.*;

public class javaStackBalancingBRACKETS {
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
            String input=sc.next();

            // method-01

            // System.out.println(input.replaceAll("\\(\\)|\\{\\}|\\[\\]","").length()==0);

            // method-02 better way using stack 

            // System.out.println(bbcheck(input));
            
		}
		
	}
    public static boolean bbcheck(String s){
        Stack<Character> bb=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                bb.push(ch);
            }
            else{
                if(bb.isEmpty()){
                return false;
            }
            if(ch==')'){
                if(bb.peek()=='(')bb.pop();
                else{
                    return false;
                }
            }
            if(ch=='}'){
                if(bb.peek()=='{')bb.pop();
                else{
                    return false;
                }
            }
            if(ch==']'){
                if(bb.peek()=='[')bb.pop();
                else{
                    return false;
                }
            }
        }
        }
        return bb.isEmpty();

    }
}
