package emifly.fizzbuzzclasses;

import java.util.ArrayList;

public class FizzRule implements Rule {

    public void applyRule(int number, ArrayList<String> buzzwordsList) {
        if (number % 3 == 0)
            buzzwordsList.add("Fizz");
    }
}
