interface CalculationStrategy {
    double calculate(double num1, double num2);
}
//Default interfaces
class AdditionStrategy implements CalculationStrategy {
    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}

class SubtractionStrategy implements CalculationStrategy {
    @Override
    public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}

