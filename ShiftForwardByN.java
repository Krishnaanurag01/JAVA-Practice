

public class ShiftForwardByN {
    
    public static void main(String[] args) {
        swapForward("hey there ");
    }
    
    public static void swapForward(String  s) {
        
        String[] arr = s.split(" ");
        String temp  = "";

        for (int k = 0 ; k < arr.length ; k++) {
            int n = arr[k].length();

            for (int i = 0; i < n; i++) {
                
                int asci = arr[k].charAt(i) + n;
                if(arr[k].charAt(i) + 0 <= 90){

                    temp += (char) (Math.min(asci, 90)) ;
                }
                else if(arr[k].charAt(i) + 0 > 97){
                    temp += (char) (Math.min(asci, 122)) ;
                }
            }
            if(k < arr.length-1){
                temp += " ";
            }
        }


        System.out.println(temp.length() == s.length());
        System.out.println(temp);







        // char[] a = s.toCharArray();
        // for (char c : a) {

        //     System.out.println(c);
        // }


        // for (int i = 0; i < s.length(); i++) {
        //     i
        // }


        // sys


        // for (String string : arr) {
        //     System.out.print(string);
        // }
    }
}