package shital.customExceptionPractice;

public class NullPointerExceptionScenario {

    public static void main(String[] args) {
        String test="shital";

        System.out.println(test.length());

        test.charAt(6);
    }
}
