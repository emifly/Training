package emifly.fizzbuzzclasses;

import java.util.ArrayList;

public class BuzzRule implements Rule {

    public void applyRule(int number, ArrayList<String> buzzwordsList) {
        if (number % 5 == 0)
            buzzwordsList.add("Buzz");
    }
}
