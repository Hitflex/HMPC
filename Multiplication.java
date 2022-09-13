import java.util.Scanner;
public class Multiplication {
    public void multiplication () {
        Scanner mul = new Scanner(System.in);
        System.out.println("Enter first then second number");
        System.out.println(mul.nextDouble() * mul.nextDouble());
    }
}