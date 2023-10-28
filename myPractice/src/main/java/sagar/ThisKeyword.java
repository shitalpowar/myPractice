package sagar;

public class ThisKeyword {

    int rollNo;

    public ThisKeyword() {
        System.out.println("calling default constructor");
    }

    public ThisKeyword(int rollNo) {
        this();
        this.rollNo = rollNo;
        System.out.println(rollNo);

    }

    public static void main(String[] args) {
        ThisKeyword a1 = new ThisKeyword();

        ThisKeyword a2 = new ThisKeyword(10);
    }
}
