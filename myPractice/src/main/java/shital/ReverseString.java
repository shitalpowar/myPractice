package shital;

public class ReverseString {
    public static void main(String[] args) {

    String str = "sagara";

        System.out.println(reverseGivenString(str));
    }

    public static String reverseGivenString(String input){
        StringBuilder builder = new StringBuilder();

        char[] array = input.toCharArray();
        for (int i = array.length-1; i>=0; i--){
            builder.append(array[i]);
        }
        String reversedString = builder.toString();
        return reversedString;
    }

}
