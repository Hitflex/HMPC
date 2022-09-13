import java.util.Scanner;
class Main {
    public static void main (String args[]) {
        Scanner jkl = new Scanner(System.in);
        int answer;
        double amount, principal, rate=.01;
        System.out.println("Winnie Edward's Multi-Purpose Calculator");
        System.out.println("[1] addition\t[2] subtraction\t[3] multiplication\t[4] division\n[5] round up\t[6] round down\t[7] min\t[8] max\n[9] exponent\t[10] square root");
        answer = jkl.nextInt();
        if (answer == 1) {
          Addition AdditionObject = new Addition();
          AdditionObject.addition();
        }
        else if (answer == 2) {
            Subtraction SubtractionObject = new Subtraction();
            SubtractionObject.subtraction();
        }
        else if (answer == 3) {
            Multiplication MultiplicationObject = new Multiplication();
            MultiplicationObject.multiplication();
        }
        else if (answer == 4) {
            Division DivisionObject = new Division();
            DivisionObject.division();
        }
        else if (answer == 5) {
            RU RUObject = new RU();
            RUObject.ru();
        }
        else if (answer == 6) {
            RD RDObject = new RD();
            RDObject.rd();
        }
        else if (answer == 7) {
            Min MinObject = new Min();
            MinObject.min();
        }
        else if (answer == 8) {
            Max MaxObject = new Max();
            MaxObject.max();
        }
        else if (answer == 9) {
            Pow PowObject = new Pow();
            PowObject.pow();
        }
        else if (answer == 10) {
            Sqrt SqrtObject = new Sqrt();
            SqrtObject.sqrt();
        }
        else if (answer == 11) {
            Secret SecretObject = new Secret();
            SecretObject.secret();
        }
        /*System.out.println("Enter amount: ");
        principal = jkl.nextInt();
        for (int day=1;day<=20;day++) {
            amount = principal*Math.pow(1+rate, day);
            System.out.println(amount);
        }
        */
    }
}