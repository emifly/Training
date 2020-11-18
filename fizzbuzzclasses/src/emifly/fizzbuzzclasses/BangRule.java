package emifly.fizzbuzzclasses;

import java.util.ArrayList;

public class BangRule implements Rule {

    public void applyRule(int number, ArrayList<String> buzzwordsList) {
        if (number % 7 == 0)
            buzzwordsList.add("Bang");
    }
}
