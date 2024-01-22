package shital.functionalInterface;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        Predicate<Integer> ifEligibleToVote = t ->t>18;
        //System.out.println(ifEligibleToVote.test(12));
        //System.out.println(ifEligibleToVote.test(20));

        Person person = new Person();
        person.setAge(35);

        System.out.println(ifEligibleToVote.test(person.getAge()));

    }
}
