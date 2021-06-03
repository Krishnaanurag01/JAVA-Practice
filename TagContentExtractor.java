import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TagContentExtractor {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
            boolean ismatch=false;
            Pattern p= Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m=p.matcher(line);
            while(m.find()){
                System.out.print(m.group(2));
                ismatch=true;
            }
            if(!ismatch){
                System.out.println("None");
            }
			
          	//Write your code here
			
			testCases--;
		}
	}
}
