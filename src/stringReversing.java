public class stringReversing {
    public String reverseString(String input) {

        char[] charArray = input.toCharArray();
        int startPoint = 0;
        int endPoint = charArray.length - 1;

        char temporary;
        while (startPoint < endPoint) {
            if (!Character.isDigit(charArray[startPoint]) && !Character.isDigit(charArray[endPoint])) {
                temporary = charArray[startPoint];
                charArray[startPoint] = charArray[endPoint];
                charArray[endPoint] = temporary;
            }
            startPoint++;
            endPoint--;
        }

        return new String(charArray);
    }
}

