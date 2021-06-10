import java.math.BigInteger;

public class BigIntger {
    public static void main(String[] args) {
        System.out.println(fact(200));
    }
    static BigInteger fact(int n){
        BigInteger f=new BigInteger("1");
        for ( int i = 1; i < n; i++) {
            f=f.multiply(BigInteger.valueOf(i));
            
        }
        return f;
    }
}
