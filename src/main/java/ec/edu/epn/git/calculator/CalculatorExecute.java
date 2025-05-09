package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("== Calculator Execute ==");

        Calculator c = new Calculator();
        int addiction = c.addition(4,7);
        System.out.println("c.addiction(4,7) = " + addiction);

        int subtraction = c.sustraction(7,1);
        System.out.println("c.subtraction(7,1) = " + subtraction);

    }
}
