package day59_Exception_Continue;

public class ThrowingExceptionProgrammatically {
    public static void main(String[] args) {
        NullPointerException e2 = new NullPointerException("Back to earth");
        throw e2;

    }
}
