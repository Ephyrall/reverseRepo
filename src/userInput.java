import java.util.Scanner;
public class userInput {

    public String getUserInput() {

        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Введите строку желаемую для реверса: ");
        return consoleInput.nextLine();

    }
}
