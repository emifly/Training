package emifly.fizzbuzzclasses;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseRule implements Rule {

    public void applyRule(int number, ArrayList<String> buzzwordsList) {
        if (number % 17 == 0)
            Collections.reverse(buzzwordsList);
    }
}
