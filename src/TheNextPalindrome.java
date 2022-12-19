import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//https://www.spoj.com/problems/PALIN/

public class TheNextPalindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        for (int i = 0; i < testcases; i++) {
            int givenNumber = scan.nextInt();
            List<String> numberInString = new ArrayList();
            while (givenNumber != -300) {
                //splituje cyfre
                String givenNumberInString = Integer.toString(givenNumber);
                String[] givenNumberSplitted = givenNumberInString.split("");
                int lengthOfSplittedArray = givenNumberSplitted.length - 1;
                //to obraca liczbe
                for (int j = lengthOfSplittedArray; j >= 0; j--) {
                    String splittednumber = givenNumberSplitted[j];
                    numberInString.add(splittednumber);
                }
                String foldedNumber = "";
                //tu mam tabele z liczbą teraz tylko złożyć
                for (int k = 0; k <= lengthOfSplittedArray; k++) {
                    foldedNumber = foldedNumber + numberInString.get(k);
                }

                int foldedReversedNumberInInt = Integer.parseInt(foldedNumber);
                int givenNumberInInt = Integer.parseInt(givenNumberInString);

                if (givenNumberInInt == foldedReversedNumberInInt) {
                    System.out.println(foldedReversedNumberInInt);
                    break;
                } else {
                    givenNumber++;
                    numberInString.clear();
                }
            }
        }
    }
}