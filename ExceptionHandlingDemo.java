// Custom exception class
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    // Method that uses "throws" to declare it might throw MyException
    public static void checkValue(int number) throws MyException {
        if (number < 0) {
            // Using "throw" to manually throw an exception
            throw new MyException("Number cannot be negative!");
        } else {
            System.out.println("Valid number: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            // May throw ArithmeticException
            int result = 10 / 2;
            System.out.println("Result: " + result);

            // May throw MyException
            checkValue(-5);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());

        } catch (MyException e) {
            System.out.println("Caught MyException: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("Finally block executed.");
        }
    }
}
