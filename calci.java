class ScientificCalculator {
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    
    public static String decimalToFraction(double num) {
        int maxDenominator = 1000;
        int numerator = (int) (num * maxDenominator);
        int denominator = maxDenominator;
        int gcdValue = gcd(numerator, denominator);
        numerator /= gcdValue;
        denominator /= gcdValue;
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 5.2;

    
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

    
        double difference = num1 - num2;
        System.out.println("Difference: " + difference);

    
        double product = num1 * num2;
        System.out.println("Product: " + product);

    
        double quotient = num1 / num2;
        System.out.println("Quotient: " + quotient);

    
        double sqrtNum1 = Math.sqrt(num1);
        System.out.println("Square root of num1: " + sqrtNum1);

    
        double expNum2 = Math.exp(num2);
        System.out.println("Exponential of num2: " + expNum2);

    
        double angleInRadians = Math.toRadians(30); 
        double sinValue = Math.sin(angleInRadians);
        System.out.println("Sin(30 degrees): " + sinValue);

        double cosValue = Math.cos(angleInRadians);
        System.out.println("Cos(30 degrees): " + cosValue);

        double tanValue = Math.tan(angleInRadians);
        System.out.println("Tan(30 degrees): " + tanValue);

    
        String fractionResult = decimalToFraction(quotient);
        System.out.println("Quotient in p/q format: " + fractionResult);
    }
}

