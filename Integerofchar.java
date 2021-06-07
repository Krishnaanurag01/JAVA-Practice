public class Integerofchar {
    public static void main(String[] args) {
        String a="Hey";
        int hash=0;
        for (int i = 0; i < a.length(); i++) {
            hash+=a.charAt(i);
            System.out.println(hash);
        }
    }
    
}
