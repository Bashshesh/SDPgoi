public class Main {
    public static void main(String[] args) {
        //Strategy

        Calculator additionCalculatorStrategy = new Calculator(new AdditionStrategy());

        double resultAddition = additionCalculatorStrategy.performCalculation(5, 3); // Primer
        System.out.println("Addition Result from Strategy: " + resultAddition);

        // Create a calculator with the subtraction strategy
        Calculator subtractionCalculatorStrategy = new Calculator(new SubtractionStrategy());

        double resultSubtraction = subtractionCalculatorStrategy.performCalculation(5, 3); // Vtoroi Primer
        System.out.println("Subtraction Result from Strategy: " + resultSubtraction);


        // Get the Singleton instance
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();

        // Checking instances
        System.out.println("Are the references the same instance? " + (singleton == anotherSingleton));



        //Singleton
        Calculator additionCalculatorSingleton = new Calculator(new AdditionStrategy());

        double resultAddition1 = additionCalculatorSingleton.performCalculation(5, 3); // Primer Singleton
        System.out.println("Addition Result from Singleton: " + resultAddition1);

        // Create a calculator with the subtraction strategy
        Calculator subtractionCalculatorSingleton = new Calculator(new SubtractionStrategy());

        double resultSubtraction1 = subtractionCalculatorSingleton.performCalculation(5, 3); // Vtoroi primer Singleton
        System.out.println("Subtraction Result Singleton: " + resultSubtraction1);
    }
}

//пожалуйста поставьте много баллов <3