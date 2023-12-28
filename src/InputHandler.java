import java.util.Scanner;
public class InputHandler {

    public String getUserInput() {

        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Enter the string desired for the reversal:");
        return consoleInput.nextLine();

    }
}
