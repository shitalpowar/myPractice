package shital.optionalPractice;

import java.util.Optional;

public class OptionalTest{

    public static void main(String[] args) {

        String str = null;
        if (str == null){
            System.out.println("string is null");
        }
        else {
            System.out.println(str.length());        }

        String str2 = "aaaaa";
        Optional<String> optional = Optional.of(str2);
        Optional<String> optional1 = Optional.ofNullable(str);

        System.out.println(optional.isEmpty());
        System.out.println(optional1.isEmpty());

        System.out.println(optional1.orElse("optional 1 empty ahe"));
        System.out.println(optional.orElse("optional empty ahe"));








    }


}
