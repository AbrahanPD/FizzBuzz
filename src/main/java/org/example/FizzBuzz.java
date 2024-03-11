/**
 * FizzBuzz
 * Esta aplicación imprime los números del 1 al 100.
 * Cuando el número es múltiplo de 3 o contiene el 3 imprime "Fizz".
 * Cuando el número es múltiplo de 5 o contiene el 5 imprime "Buzz".
 * Ejemplo:
 * 53 debe devolver FizzBuzz (contiene 5 y 3)
 * 35 debe devolver FizzBuzzBuzz (contiene 3 y 5 y es divisible por 5).
**/
package org.example;

import org.jetbrains.annotations.NotNull;

public class FizzBuzz {
    // Método que recibe como entrada un entero y devuelve un String tras evaluarlo
    public static @NotNull String fizzBuzz(int i) {
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
