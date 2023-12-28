public class Main {
    public static void main(String[] args) {
        InputHandler userInput = new InputHandler();

        String input = userInput.getUserInput();

        StringManipulator stringManipulator = new StringManipulator();

        String ManipulatedString = stringManipulator.reverseStringWithoutDigits(input);

        System.out.println(ManipulatedString);
    }
}