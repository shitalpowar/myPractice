package sagar;

public class ReverseGivenString {

    public static void main(String[] args) {
        System.out.println(reverseString("abcd"));
        System.out.println(useStringBuilderReverse("1234"));
    }

    public static String reverseString(String input){
        StringBuilder out = new StringBuilder();

        char[] chars = input.toCharArray();
        for(int i =chars.length-1;i>=0;i--){
            out.append(chars[i]);
        }
        return out.toString();
    }

    public static String useStringBuilderReverse(String input){
        StringBuilder builder = new StringBuilder();
        char[] chars = input.toCharArray();
        for(int i= chars.length-1;i>=0;i--){
            builder.append(chars[i]);
        }
        return builder.reverse().toString();
    }
}
