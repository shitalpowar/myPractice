package shital.defaultInterface;

public class PracticeDefaultImpl implements PracticeDefault{
    @Override
    public void add() {
        System.out.println("this is add method");

    }

    @Override
    public void init() {
        System.out.println("method overridden");
    }

    public static void main(String[] args) {
        PracticeDefaultImpl aDefault = new PracticeDefaultImpl();
        aDefault.add();
        aDefault.init();
    }
}
