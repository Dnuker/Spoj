import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//https://www.spoj.com/problems/PALIN/
//chyba lepszym pomysłem bedzie wpierw przekonwertowanie liczby do array int a potem reevert
public class TheNextPalindrome {
  /*     public static int[] toIntArray(List<Integer> list) {
            int[] ret = new int[list.size()];
            for(int i = 0; i < ret.length; i++)
                ret[i] = list.get(i);
            return ret;
        }
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int givenNumber = scan.nextInt();
        List<String> numberInString = new ArrayList();
        while (givenNumber!=-300) {
            //splituje cyfre
            String givenNumberInString = Integer.toString(givenNumber);
            String[] givenNumberSplitted = givenNumberInString.split("");
            int lengthOfSplittedArray = givenNumberSplitted.length - 1;
            //to obraca liczbe
            for (int i = lengthOfSplittedArray; i >= 0; i--) {
                String splittednumber = givenNumberSplitted[i];
                numberInString.add(splittednumber);
            }
            String foldedNumber = "";
            //tu mam tabele z liczbą teraz tylko złożyć
            for (int i = 0; i <= lengthOfSplittedArray; i++) {
                foldedNumber = foldedNumber + numberInString.get(i);
            }

            int foldedReversedNumberInInt = Integer.parseInt(foldedNumber);
            int givenNumberInInt = Integer.parseInt(givenNumberInString);

            if (givenNumberInInt == foldedReversedNumberInInt) {
                System.out.println(foldedReversedNumberInInt);
                return;
            } else {
                givenNumber++;
                numberInString.clear();
            }

        }
    }
}