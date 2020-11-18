package emifly.fizzbuzzclasses;

import java.util.ArrayList;

public class FizzBuzz {
    private static final Rule[] DEFAULT_RULES = {
        new FizzRule(),
        new BuzzRule(),
        new BangRule(),
        new BongRule(),
        new FezzRule(),
        new ReverseRule()
    };

    public String getNumberOrBuzzwords(int number, Rule[] rules) {
        ArrayList<String> buzzwordsList = new ArrayList<String>();

        for (Rule rule : rules)
            rule.applyRule(number, buzzwordsList);

        return buzzwordsList.isEmpty() ? Integer.toString(number) : String.join("", buzzwordsList);
    }

    public String getNumberOrBuzzwords(int number) {
        return getNumberOrBuzzwords(number, DEFAULT_RULES);
    }
}
