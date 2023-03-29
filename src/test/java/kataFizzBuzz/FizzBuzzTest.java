package kataFizzBuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void siNumEsMultiplo3devuelveFizz() {

        //GIVEN
        var fizzbuzz = new FizzBuzz();

        //WHEN
        var sut = fizzbuzz.execute(3);

        //THEN
        assertEquals("Fizz", sut);
    }

    @Test
    void siNumEsMultiplo5devuelveBuzz() {

        //GIVEN
        var fizzbuzz = new FizzBuzz();

        //WHEN
        var sut = fizzbuzz.execute(5);

        //THEN
        assertEquals("Buzz", sut);
    }


    @Test
    void siNumEsMultiplo3y5devuelveFizzBuzz() {

        //GIVEN
        var fizzbuzz = new FizzBuzz();

        //WHEN
        var sut = fizzbuzz.execute(15);

        //THEN
        assertEquals("FizzBuzz", sut);
    }




    }
