package emifly.fizzbuzzclasses;

import java.util.ArrayList;

public class BongRule implements Rule {

    public void applyRule(int number, ArrayList<String> buzzwordsList) {
        if (number % 11 == 0) {
            buzzwordsList.clear();
            buzzwordsList.add("Bong");
        }
    }
}
