import java.util.Scanner;
public class AnagramHackerRank { 
    
        static boolean isAnagram(String a, String b) {
            // Complete the functio
            String A= a.toUpperCase();
            String B= b.toUpperCase();
            
            char firststr[] =new char[256];
            char secondstr[] =new char[256];
            for(char i:A.toCharArray()){
                int index=(int)i;
                firststr[index]++;
            }
            for(char i:B.toCharArray()){
                int index=(int)i;
                secondstr[index]++;
            }
            for(int i=0;i<256;i++){
                if(firststr[i]!=secondstr[i]){
                    return false;
                }
            }
            return true;
            }
            //             method-02
            // char aa[] = a.toLowerCase().toCharArray();
            // char bb[] = b.toLowerCase().toCharArray();
            // if(a.length() != b.length()){
            //     return false;
            // }else{
            //     java.util.Arrays.sort(aa);
            //     java.util.Arrays.sort(bb);
            //     return java.util.Arrays.equals(aa, bb);
            // }
    
      public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }
    
    

