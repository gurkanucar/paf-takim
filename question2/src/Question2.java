import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int x = in.nextInt();
            int y = in.nextInt();
            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println(exception + "");
        } catch (InputMismatchException exception) {
            System.out.println(new InputMismatchException(null) + "");
        }
    }
}
