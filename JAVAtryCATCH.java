import java.util.*;

public class JAVAtryCATCH {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
            sc.close();
        } catch (InputMismatchException e) {

            System.out.println("java.util.InputMismatchException");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}