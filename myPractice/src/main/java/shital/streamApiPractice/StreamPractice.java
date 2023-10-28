package shital.streamApiPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        //without stream
        List<Integer> list = List.of(1, 2, 4, 6, 8, 9);

        List<Integer> evenNumbers = new ArrayList<>();

        for (int i : list
        ) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }

        }
        System.out.println(evenNumbers);

        List<Integer> streamEvenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());


    }
}
