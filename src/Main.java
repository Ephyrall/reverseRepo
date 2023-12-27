public class Main {
    public static void main(String[] args) {
        userInput userInput = new userInput();

        String input = userInput.getUserInput();

        stringReversing stringReversing = new stringReversing();

        String reversedString = stringReversing.reverseString(input);

        consoleResult consoleResult = new consoleResult();

        consoleResult.printResult(reversedString);
    }
}