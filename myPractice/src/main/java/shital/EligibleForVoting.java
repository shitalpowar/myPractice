package shital;

public class EligibleForVoting {
    public static void main(String[] args) {

        int age = 12;
        if (age>=18 && age<=60){
            System.out.println("eligible for vote");
        }else if(age>60){
            System.out.println("senior citizen");
        }else{
            System.out.println("i am child");
        }

        System.out.println(checkIfEligibleForVot(12));
        int n = 2;
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }

    public static boolean checkIfEligibleForVot(int i){
        return i>=18;
    }
}
