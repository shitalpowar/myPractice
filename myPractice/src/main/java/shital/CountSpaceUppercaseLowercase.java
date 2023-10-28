package shital;

import java.util.Scanner;

public class CountSpaceUppercaseLowercase {
    public static void main(String[] args) {

        System.out.println("enter string");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(str);

        Integer space = 0;
        Integer upperCase = 0;
        Integer lowerCase = 0;
        Integer spChar=0;
        for (int i = 0; i<= str.length()-1;i++){
            char ch = str.charAt(i);

            if(Character.isWhitespace(ch)){
                space++;
            } else if (Character.isUpperCase(ch)) {
                upperCase++;

            } else if (Character.isLowerCase(ch)) {
                lowerCase++;

            }
            else {
                spChar++;

            }


        }
        System.out.println("whitespaces :" +space);
        System.out.println("upperCase :" +upperCase );
        System.out.println("lowerCase :" +lowerCase);
        System.out.println("spChar :"+spChar);


    }
}
