package kataFizzBuzz;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class FizzBuzz {

    public String execute(int numero) {

        // if (numero % 15 == 0) {return "FizzBuzz";}
        // if (numero % 3 == 0 && numero % 5 == 0) {return "FizzBuzz";}
        if (numero % 3 == 0) {
            if (numero % 5 == 0) {return "FizzBuzz";}
            return "Fizz";}
        if (numero % 5 == 0) {return "Buzz";}

        return String.valueOf(numero);}

}

