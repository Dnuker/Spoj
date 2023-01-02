import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
//https://www.spoj.com/problems/PALIN/
//zmien na chary
//2 podejscie do nazewnictwa
//wywalic kod do funkcji do funkcji

public class TheNextPalindrome {
   public static String[] splitString(String stringToSplit) {
                String[] givenNumberSplitted = stringToSplit.split("");
                return givenNumberSplitted;

    }
    public static List<String> reverseNumber(int length,String numberToReverse){
        List<String> numberInString = new ArrayList();
        for (int j = length; j >= 0; j--) {
            String splittednumber = splitString(numberToReverse)[j];
            numberInString.add(splittednumber);
        }
        return numberInString;
    }
   public static String foldNumber(int lengthOfSplittedArray, List<String> numberInStringList) {
       String foldedNumber = "";
       for (int k = 0; k <= lengthOfSplittedArray; k++) {
           foldedNumber = foldedNumber + numberInStringList.get(k);
       }
       return foldedNumber;
   }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCaseCount = scan.nextInt();
        for (int i = 0; i < testCaseCount; i++) {
            int givenNumber = scan.nextInt();

            while (true) {
               String givenNumberInString = Integer.toString(givenNumber);
                int lengthOfSplittedArray = splitString(givenNumberInString).length - 1;
                int foldedReversedNumber = Integer.parseInt(foldNumber(lengthOfSplittedArray,reverseNumber(lengthOfSplittedArray,givenNumberInString)));
                if (givenNumber == foldedReversedNumber) {
                    System.out.println(foldedReversedNumber);
                    break;
                } else {
                    givenNumber++;
                }
            }
        }
    }
}