package sagar;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        System.out.println(checkPrimeNumber(5));

        System.out.println("we are checking prime number");

        System.out.println("we are checking pull");

    }

    public static boolean checkPrimeNumber(Integer n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i =2 ;i <= n/2;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }



}
