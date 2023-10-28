package shital.junitPractice;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    Addition addition = new Addition();

    @org.junit.jupiter.api.Test
    void add() {
        int m = 10;
        int n = 12;

        assertEquals(22,addition.add(m,n));
    }
}