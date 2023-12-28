public class StringManipulator {
    public String reverseStringWithoutDigits(String input) {

        char[] charArray = input.toCharArray();
        int startPoint = 0;
        int endPoint = charArray.length - 1;

        char temporaryChar;
        while (startPoint < endPoint) {
            if (!Character.isDigit(charArray[startPoint]) && !Character.isDigit(charArray[endPoint])) {
                temporaryChar = charArray[startPoint];
                charArray[startPoint] = charArray[endPoint];
                charArray[endPoint] = temporaryChar;
            }
            startPoint++;
            endPoint--;
        }

        return new String(charArray);
    }
}

