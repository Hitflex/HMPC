import java.util.Scanner;
public class Pow {
    public void pow () {
        Scanner pow = new Scanner(System.in);
        System.out.println("Enter first number then second number as exponent");
        System.out.println(Math.pow(pow.nextDouble(), pow.nextDouble()));
    }
}