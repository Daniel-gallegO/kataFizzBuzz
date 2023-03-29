package kataFizzBuzz;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class FizzBuzz {

    public String execute(int numero) {


        if (numero % 3 == 0) {return "Fizz";}
        if (numero % 5 == 0) {return "Buzz";}

        return "null";}

}

