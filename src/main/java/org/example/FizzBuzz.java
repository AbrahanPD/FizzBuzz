package org.example;
public class FizzBuzz {
    public static String fizzBuzz(int i) {
        String fizz = Integer.toString(i);
        if (fizz.contains("3") && fizz.contains("5") && i % 3 == 0) {
            System.out.println("FizzFizzBuzz");
            return "FizzFizzBuzz";
        } else if (fizz.contains("3") && fizz.contains("5") && i % 5 == 0) {
            System.out.println("FizzBuzzBuzz");
            return "FizzBuzzBuzz";
        } else if (fizz.contains("3") && i % 3 == 0) {
            System.out.println("FizzFizz");
            return "FizzFizz";
        } else if (fizz.contains("5") && i % 5 == 0) {
            System.out.println("BuzzBuzz");
            return "BuzzBuzz";
        } else if (fizz.contains("3") || i % 3 == 0) {
            System.out.println("Fizz");
            return "Fizz";
        } else if (fizz.contains("5") || i % 5 == 0) {
            System.out.println("Buzz");
            return "Buzz";
        } else {
            System.out.println(i);
            return fizz;
        }
    }
}
