package shital.lambadaPractice;

public class Main {
    public static void main(String[] args) {
        MyFirstLambada lambada = new MyFirstLambada();

        System.out.println(lambada.multiply(2,8));

        InterMultiply multiply = new MyFirstLambada();

        System.out.println(multiply.multiply(3,3));

        InterMultiply multiply1 = new InterMultiply() {
            @Override
            public int multiply(int a, int b) {
                return a * b;
            }
        };
        System.out.println(multiply1.multiply(3,4));

        System.out.println("using lambda");

        InterMultiply multiply2 = ( a, b)-> a*b;

        System.out.println(multiply2.multiply(12,2));
    }
}
