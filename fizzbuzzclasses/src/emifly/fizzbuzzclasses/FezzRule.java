package emifly.fizzbuzzclasses;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class FezzRule implements Rule {

    public void applyRule(int number, ArrayList<String> buzzwordsList) {
        if (number % 13 == 0) {
            int positionToInsert = IntStream.range(0, buzzwordsList.size())
                .filter(i -> buzzwordsList.get(i).startsWith("B"))
                .findFirst()
                .orElse(buzzwordsList.size());
            buzzwordsList.add(positionToInsert, "Fezz");
        }
    }
}
