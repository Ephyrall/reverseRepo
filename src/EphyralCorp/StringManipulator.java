package EphyralCorp;
public class StringManipulator {
    public String reverseStringWithoutDigits(String input) {

        char[] inputAsArray = input.toCharArray();
        int startPoint = 0;
        int endPoint = inputAsArray.length - 1;

        char temporary;
        while (startPoint < endPoint) {
            if (!Character.isDigit(inputAsArray[startPoint]) && !Character.isDigit(inputAsArray[endPoint])) {
                temporary = inputAsArray[startPoint];
                inputAsArray[startPoint] = inputAsArray[endPoint];
                inputAsArray[endPoint] = temporary;
            }
            startPoint++;
            endPoint--;
        }

        return new String(inputAsArray);
    }
}

