import java.util.Scanner;
public class Secret {
    public void secret () {
        Scanner secret = new Scanner(System.in);
        System.out.println("Enter first then second number to find out its remainder");
        System.out.println(secret.nextDouble() % secret.nextDouble());
    }
}