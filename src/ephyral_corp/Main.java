package ephyral_corp;

public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();

        String userInput = inputHandler.getUserInput();

        StringManipulator stringManipulator = new StringManipulator();

        String stringAfterManipulations = stringManipulator.reverseStringWithoutDigits(userInput);

        System.out.println(stringAfterManipulations);
    }
}