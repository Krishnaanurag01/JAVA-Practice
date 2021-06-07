//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class ArrayMap{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        Map<String,Integer> dict=new HashMap<>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            dict.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(dict.get(s)!=null){
                System.out.print(s+"="+dict.get(s));
                System.out.println();

            }
            else{
                System.out.println("Not found");
            }
		}

	}
}



