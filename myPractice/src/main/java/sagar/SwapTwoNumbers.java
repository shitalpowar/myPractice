package sagar;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 24;
        int b = 25;

        System.out.println("before swapping a : "+a +"..b : "+b);

        b = b+a;
        a = b-a;
        b= b-a;

        System.out.println("after swapping a : "+a +"..b : "+b);



    }
}
