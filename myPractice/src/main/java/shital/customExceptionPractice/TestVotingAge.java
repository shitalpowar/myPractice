package shital.customExceptionPractice;

public class TestVotingAge {

    static void checkValidAge(int age) throws InvalidAgeException {

        if(age<18){

            throw new InvalidAgeException("age not valid for vote");
        }
        else {
            System.out.println("you can vote");
        }

    }

    public static void main(String[] args)  {
        try {
            checkValidAge(0);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
        finally{
            System.out.println("voting process ended");
            System.out.println("we are checking conflict");
        }
    }

}
