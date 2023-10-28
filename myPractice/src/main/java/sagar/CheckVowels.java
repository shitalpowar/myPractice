package sagar;

public class CheckVowels {
    public static void main(String[] args) {
        System.out.println(checkIfStringContainsVowels("hello"));

        printVowels("hello");
    }




    public static boolean checkIfStringContainsVowels(String input){
        return  input.toLowerCase().matches(".*[aeiou].*");
    }
    public static void printVowels(String input){
        input.toLowerCase();
        for(int i= 0;i< input.length();i++){
            char currentChar = input.charAt(i);
            boolean checkIfCharVowel = currentChar == 'a' || currentChar == 'e'|| currentChar == 'i'|| currentChar == 'o'||currentChar == 'u';
            if(checkIfCharVowel){
                System.out.println(currentChar);
            }
        }
    }
}
