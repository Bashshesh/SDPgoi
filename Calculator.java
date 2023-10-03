public class Calculator {
    private CalculationStrategy strategy;

    public Calculator(CalculationStrategy strategy) {
        this.strategy = strategy;
        //по книжке все
    }

    public double performCalculation(double num1, double num2) {
        return strategy.calculate(num1, num2);
    }
}
