package fizzbuzz;

import org.example.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    // Si el número es múltiplo de tres, devolverá la palabra "Fizz".
    // Si el número es múltiplo de cinco, devolverá la palabra "Buzz".
    // Si el número es múltiplo de tres y de cinco, devolverá la palabra "FizzBuzz".
    // Si no coincide las opciones de arriba retorna el numero.

    @Test
    public void check_1_to_1() {
        assertEquals("1", new FizzBuzz().convert(1));
    }

    @Test
    public void check_2_to_2() {
        assertEquals("2" , new FizzBuzz().convert(2));
    }

    @Test
    public void check_3_to_Fizz() {
        assertEquals("Fizz", new FizzBuzz().convert(3));
    }

    @Test
    public void check_5_to_Buzz(){
        assertEquals("Buzz", new FizzBuzz().convert(5));
    }

    @Test
    public void check_15_to_FizzBuzz() {
        assertEquals("FizzBuzz", new FizzBuzz().convert(15));
    }

    }