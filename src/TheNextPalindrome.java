import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
//https://www.spoj.com/problems/PALIN/


public class TheNextPalindrome {
   public static char[] splitString(String stringToSplit) {
                char[] givenNumberSplittedChar=stringToSplit.toCharArray();
                return givenNumberSplittedChar;
    }
    public static List<Character> reverseNumber(String numberToReverse)
    {      int length = splitString(numberToReverse).length-1;

        List<Character> numberInChar = new ArrayList();
        for (int j = length; j >= 0; j--) {
            char splittednumber = splitString(numberToReverse)[j];
            numberInChar.add(splittednumber);
        }
        return numberInChar;
    }
   public static String foldNumber(List<Character> numberInCharList) {
       int lengthOfSplittedArray=numberInCharList.size()-1;
       String foldedNumber = "";
       for (int k = 0; k <= lengthOfSplittedArray; k++) {
           foldedNumber = foldedNumber + numberInCharList.get(k);
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


                int foldedReversedNumber = Integer.parseInt(foldNumber(reverseNumber(givenNumberInString)));
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