package shital.streamApiPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNames {

    public static void main(String[] args) {

        List<String> myFamily = List.of("Shital","Sagar","Amartya","Vishal","Rajveer");
        //List<String> s = myFamily.stream().filter(i -> i.startsWith("S")).collect(Collectors.toList());
        //System.out.println(s);

        List<String> names = new ArrayList<>();
        names.add("abc");
        names.add("xyz");
        Collections.reverse(names);

        System.out.println(names);
    }
}
