package shital.staticMethods;

public class StaticMathodImpl implements StaticMethodPractice{
    @Override
    public int add() {
        return 2+2;
    }
    public static void printStatic(){
        System.out.println("this is static method in class");
    }

    public static void main(String[] args) {
        StaticMathodImpl method = new StaticMathodImpl();
        method.add();

        StaticMethodPractice.method();
        StaticMathodImpl.printStatic();
    }

}
