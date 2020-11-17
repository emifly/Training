package emifly.fizzbuzz;

public class Main {

    public static void part1() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    public static final String GREEN = "\033[36m";
    public static final String RED = "\033[31m";
    public static final String CLEAR = "\033[0m";

    public static String getRedText(String text) {
        return RED + text + CLEAR;
    }

    public static String getGreenText(String text) {
        return GREEN + text + CLEAR;
    }
    public static final int OFF = 0;
    public static final int FIZZ = 0b1;
    public static final int FEZZ = 0b10;
    public static final int BUZZ = 0b100;
    public static final int BANG = 0b1000;
    public static final int BONG = 0b10000;
    public static final String[] buzzwords = {"Fizz", "Fezz", "Buzz", "Bang", "Bong"};
    public static final int[] buzzwordSwitches = {FIZZ, FEZZ, BUZZ, BANG, BONG};

    public static String getBuzzwords(int switchesState, boolean isReversed) {
        String buzzwordString = "";
        int[] forwardIterator = {0, 1, 2, 3, 4};
        int[] backwardIterator = {4, 3, 2, 1, 0};
        int[] switchesIterator;
        int currentSwitch;

        switchesIterator = isReversed ? backwardIterator : forwardIterator;
        for (int i = 0; i < 5; i++) {
            currentSwitch = switchesState & buzzwordSwitches[switchesIterator[i]];
            if (currentSwitch != 0)
                buzzwordString += buzzwords[switchesIterator[i]];
        }
        return buzzwordString;
    }

    public static String getNumberOrBuzzwords(int number) {
        int switchesState = OFF;
        boolean isReversed = false;

        if (number % 11 == 0)
            switchesState |= BONG;
        else {
            if (number % 3 == 0)
                switchesState |= FIZZ;
            if (number % 5 == 0)
                switchesState |= BUZZ;
            if (number % 7 == 0)
                switchesState |= BANG;
        }
        if (number % 13 == 0)
            switchesState |= FEZZ;
        if (number % 17 == 0)
            isReversed = true;
        return (switchesState == OFF ? Integer.toString(number) : getBuzzwords(switchesState, isReversed));
    }

    public static void part2() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getNumberOrBuzzwords(i));
        }
    }

    static int passedTestCount = 0;
    static int failedTestCount = 0;

    public static void unitTest(int number, String expectedOutput, String factorisation) {
        String actualOutput = getNumberOrBuzzwords(number);
        boolean wasSuccessful = actualOutput.equals(expectedOutput);
        String testDescription = "Testing " + number;
        if (factorisation != null)
            testDescription += " (" + factorisation + ")";

        System.out.println(testDescription);
        System.out.println("Expected: " + expectedOutput);
        System.out.println("     Got: " + actualOutput);
        System.out.println("          " + (wasSuccessful ? getGreenText("Success!") : getRedText("Failure!")));
        System.out.println();

        if (wasSuccessful)
            passedTestCount++;
        else
            failedTestCount++;
    }

    public static void unitTest(int number, String expectedOutput) {
        unitTest(number, expectedOutput, null);
    }

    public static void part2Test() {
        unitTest(17, "17");
        unitTest(3 * 7, "FizzBang", "3 * 7");
        unitTest(5 * 7, "BuzzBang", "5 * 7");
        unitTest(3 * 5 * 7, "FizzBuzzBang", "3 * 5 * 7");
        unitTest(3 * 11, "Bong", "3 * 11");
        unitTest(5 * 11, "Bong", "5 * 11");
        unitTest(7 * 11, "Bong", "7 * 11");
        unitTest(3 * 5 * 11, "Bong", "3 * 5 * 11");
        unitTest(3 * 5 * 7 * 11, "Bong", "3 * 5 * 7 * 11");
        unitTest(3 * 13, "FizzFezz", "3 * 13");
        unitTest(5 * 13, "FezzBuzz", "5 * 13");
        unitTest(3 * 5 * 13, "FizzFezzBuzz", "3 * 5 * 13");
        unitTest(7 * 13, "FezzBang", "7 * 13");
        unitTest(11 * 13, "FezzBong", "11 * 13");
        unitTest(5 * 11 * 13, "FezzBong", "5 * 11 * 13");
        unitTest(3 * 7 * 17, "BangFizz", "3 * 7 * 17");
        unitTest(5 * 7 * 17, "BangBuzz", "5 * 7 * 17");
        unitTest(3 * 5 * 7 * 17, "BangBuzzFizz", "3 * 5 * 7 * 17");
        unitTest(3 * 13 * 17, "FezzFizz", "3 * 13 * 17");
        unitTest(5 * 13 * 17, "BuzzFezz", "5 * 13 * 17");
        unitTest(3 * 5 * 13 * 17, "BuzzFezzFizz", "3 * 5 * 13 * 17");
        unitTest(7 * 13 * 17, "BangFezz", "7 * 13 * 17");
        unitTest(11 * 13 * 17, "BongFezz", "11 * 13 * 17");
        unitTest(5 * 11 * 13 * 17, "BongFezz", "5 * 11 * 13 * 17");
        System.out.println("Tests " + getGreenText("passed") + ": " + passedTestCount);
        System.out.println("Tests " + getRedText("failed") + ": " + failedTestCount);
    }

    public static void main(String[] args) {
        part2Test();
    }
}
