import java.util.Scanner;
public class Addition {
    public void addition () {
        Scanner add = new Scanner(System.in);
        System.out.println("Enter first then second number");
        System.out.println(add.nextDouble() + add.nextDouble());
    }
}