package emifly.fizzbuzzclasses;

public class TextStyle {
    private static final String GREEN = "\033[36m";
    private static final String RED = "\033[31m";
    private static final String CLEAR = "\033[0m";

    public String getRedText(String text) {
        return RED + text + CLEAR;
    }

    public String getGreenText(String text) {
        return GREEN + text + CLEAR;
    }
}
