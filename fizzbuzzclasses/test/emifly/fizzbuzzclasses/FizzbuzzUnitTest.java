package emifly.fizzbuzzclasses;

import java.util.ArrayList;

public class FizzbuzzUnitTest {

    private static int passedTestCount = 0;
    private static int failedTestCount = 0;

    public static int getPassedTestCount() {
        return passedTestCount;
    }

    public static void incrementPassedTestCount() {
        FizzbuzzUnitTest.passedTestCount++;
    }

    public static int getFailedTestCount() {
        return failedTestCount;
    }

    public static void incrementFailedTestCount() {
        FizzbuzzUnitTest.failedTestCount++;
    }

    private static final TextStyle TEXT_STYLE = new TextStyle();

    public void printPassedTestCount() {
        System.out.println("Tests " + TEXT_STYLE.getGreenText("passed") + ": " + getPassedTestCount());
    }

    public void printFailedTestCount() {
        System.out.println("Tests " + TEXT_STYLE.getRedText("failed") + ": " + getFailedTestCount());
    }

    public void unitTest(int number, String factorisation, String expectedOutput) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualOutput = fizzBuzz.getNumberOrBuzzwords(number);
        boolean wasSuccessful = actualOutput.equals(expectedOutput);

        String testDescription = "Testing " + number;
        if (factorisation != null)
            testDescription += " (" + factorisation + ")";

        System.out.println(testDescription);
        System.out.println("Expected: " + expectedOutput);
        System.out.println("     Got: " + actualOutput);
        System.out.println("          " + (wasSuccessful ? TEXT_STYLE.getGreenText("Success!") : TEXT_STYLE.getRedText("Failure!")));
        System.out.println();

        if (wasSuccessful)
            incrementPassedTestCount();
        else
            incrementFailedTestCount();
    }

    public void unitTest(int number, String expectedOutput) {
        unitTest(number, null, expectedOutput);
    }
}
