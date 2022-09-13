import java.util.Scanner;
public class Min {
    public void min () {
        Scanner min = new Scanner(System.in);
        System.out.println("Enter first then second number to find out which is the lowest");
        System.out.println(Math.min(min.nextDouble(), min.nextDouble()));
    }
}