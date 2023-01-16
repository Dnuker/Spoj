import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

//https://www.spoj.com/problems/PALIN/


public class TheNextPalindrome {
   public static List<Character> arrayToList(char[] givenNumberInCharArray) {
       List <Character> givenNumberInCharList = new ArrayList();
       int lengthOfCharArray = givenNumberInCharArray.length;
       for(int j=0;j<lengthOfCharArray;j++){
           givenNumberInCharList.add(givenNumberInCharArray[j]);
       }
       return givenNumberInCharList;
    }

   public static String foldNumber(List<Character> numberInCharList) {
       String foldedNumber = "";
       for (int k = 0; k < numberInCharList.size(); k++) {
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
                char[] givenNumberInCharArray= givenNumberInString.toCharArray();
                List <Character> givenNumberInCharList = arrayToList(givenNumberInCharArray);
                Collections.reverse(givenNumberInCharList);

                int foldedReversedNumber = Integer.parseInt(foldNumber(givenNumberInCharList));
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