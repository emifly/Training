package emifly.fizzbuzzclasses;

public class FizzbuzzTest {

    public static void main(String[] args) {
        FizzbuzzUnitTest fbUnitTest = new FizzbuzzUnitTest();

        fbUnitTest.unitTest(17, "17");
        fbUnitTest.unitTest(3 * 7, "3 * 7", "FizzBang");
        fbUnitTest.unitTest(5 * 7, "5 * 7", "BuzzBang");
        fbUnitTest.unitTest(3 * 5 * 7, "3 * 5 * 7", "FizzBuzzBang");
        fbUnitTest.unitTest(3 * 11, "3 * 11", "Bong");
        fbUnitTest.unitTest(5 * 11, "5 * 11", "Bong");
        fbUnitTest.unitTest(7 * 11, "7 * 11", "Bong");
        fbUnitTest.unitTest(3 * 5 * 11, "3 * 5 * 11", "Bong");
        fbUnitTest.unitTest(3 * 5 * 7 * 11, "3 * 5 * 7 * 11", "Bong");
        fbUnitTest.unitTest(3 * 13, "3 * 13", "FizzFezz");
        fbUnitTest.unitTest(5 * 13, "5 * 13", "FezzBuzz");
        fbUnitTest.unitTest(3 * 5 * 13, "3 * 5 * 13", "FizzFezzBuzz");
        fbUnitTest.unitTest(7 * 13, "7 * 13", "FezzBang");
        fbUnitTest.unitTest(11 * 13, "11 * 13", "FezzBong");
        fbUnitTest.unitTest(5 * 11 * 13, "5 * 11 * 13", "FezzBong");
        fbUnitTest.unitTest(3 * 7 * 17, "3 * 7 * 17", "BangFizz");
        fbUnitTest.unitTest(5 * 7 * 17, "5 * 7 * 17", "BangBuzz");
        fbUnitTest.unitTest(3 * 5 * 7 * 17, "3 * 5 * 7 * 17", "BangBuzzFizz");
        fbUnitTest.unitTest(3 * 13 * 17, "3 * 13 * 17", "FezzFizz");
        fbUnitTest.unitTest(5 * 13 * 17, "5 * 13 * 17", "BuzzFezz");
        fbUnitTest.unitTest(3 * 5 * 13 * 17, "3 * 5 * 13 * 17", "BuzzFezzFizz");
        fbUnitTest.unitTest(7 * 13 * 17, "7 * 13 * 17", "BangFezz");
        fbUnitTest.unitTest(11 * 13 * 17, "11 * 13 * 17", "BongFezz");
        fbUnitTest.unitTest(5 * 11 * 13 * 17, "5 * 11 * 13 * 17", "BongFezz");

        fbUnitTest.printPassedTestCount();
        fbUnitTest.printFailedTestCount();
    }
}
