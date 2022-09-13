import java.util.Scanner;
public class Subtraction {
    public void subtraction () {
        Scanner sub = new Scanner(System.in);
        System.out.println("Enter first then second number");
        System.out.println(sub.nextDouble() - sub.nextDouble());
    }
}