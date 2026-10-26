package strategy;

public class Main {

    public static void main(String[] args) {
        double a = 20;
        double b = 5;

        Calculator calculator = new Calculator(new AddStrategy());

        System.out.println("Addition: " + calculator.calculate(a, b));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("Subtraction: " + calculator.calculate(a, b));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplication: " + calculator.calculate(a, b));
    }
}