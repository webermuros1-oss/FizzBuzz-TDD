package org.example;

import org.example.fizzbuzz.FizzBuzz;


public class Main {

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i = 1; i <= 15; i++) {
            System.out.println(fizzBuzz.convert(i));
        }
    }
}
