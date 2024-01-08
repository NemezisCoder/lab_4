public class DivisionCalculator {

    public static double divide(int numerator, int denominator) throws CustomDivisionException {
        if (denominator == 0) {
            throw new CustomDivisionException("Division by zero is not allowed.");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            double result = divide(10, 2); // Нормальное деление
            System.out.println("Result: " + result);
            result = divide(10,0); // Это вызовет исключение
        } catch (CustomDivisionException e) {
            System.err.println("Error: " + e.getMessage());
            ExceptionLogger.logException(e); // Логгирование исключения
        }
    }
}