import java.util.Scanner;
public class Max {
    public void max () {
        Scanner max = new Scanner(System.in);
        System.out.println("Enter first then second number to find out which is the highest");
        System.out.println(Math.max(max.nextDouble(), max.nextDouble()));
    }
}