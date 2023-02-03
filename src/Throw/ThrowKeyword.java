package Throw;

public class ThrowKeyword {
    static ArithmeticException e;  // null pointer exception
//    static ArithmeticException e = new ArithmeticException();

    public static void main(String[] args) {
        throw e;
    }
}
