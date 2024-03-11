package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        for (int i = 1; i < 100; i++) {
            if (Integer.toString(i).contains("3") && Integer.toString(i).contains("5") && i % 3 == 0) {
                assertEquals("FizzFizzBuzz", FizzBuzz.fizzBuzz(i));
            } else if (Integer.toString(i).contains("3") && Integer.toString(i).contains("5") && i % 5 == 0) {
                assertEquals("FizzBuzzBuzz", FizzBuzz.fizzBuzz(i));
            } else if (Integer.toString(i).contains("3") && i % 3 == 0) {
                assertEquals("FizzFizz", FizzBuzz.fizzBuzz(i));
            } else if (Integer.toString(i).contains("5") && i % 5 == 0) {
                assertEquals("BuzzBuzz", FizzBuzz.fizzBuzz(i));
            } else if (Integer.toString(i).contains("3") || i % 3 == 0) {
                assertEquals("Fizz", FizzBuzz.fizzBuzz(i));
            } else if (Integer.toString(i).contains("5") || i % 5 == 0) {
                assertEquals("Buzz", FizzBuzz.fizzBuzz(i));
            } else {
                assertEquals(Integer.toString(i), FizzBuzz.fizzBuzz(i));
            }
        }
    }
}