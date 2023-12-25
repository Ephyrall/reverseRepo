package forSaberMentoring;
import java.util.Scanner;

public class initializereverse {

   public static void main(String[] args) {
      Scanner consoleInput = new Scanner(System.in);
      System.out.print("Введите строку желаемую для реверса: ");
      String input = consoleInput.nextLine();

      char[] charArray = input.toCharArray();
      int startPoint = 0;
      int endPoint = charArray.length - 1;
     
      char temporary;
      for (int i = startPoint; i < endPoint; i++) {
         if (!isNumber(charArray[i]) && !isNumber(charArray[endPoint])) {
            temporary = charArray[i];
            charArray[i] = charArray[endPoint];
            charArray[endPoint] = temporary;
         }
         endPoint--;
      }

      System.out.println("Реверснутая строка: ");
      for (int i = 0; i < charArray.length; i++) {
         System.out.print(charArray[i]);
      }

   }
   private static boolean isNumber(char number) {
      return number >= '0' && number <= '9';
   }
}