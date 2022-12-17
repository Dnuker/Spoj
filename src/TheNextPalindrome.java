import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//https://www.spoj.com/problems/PALIN/

public class TheNextPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String givenNumber = scan.next();
        List<String> reversedNumberInString = new ArrayList();
        List<Integer> reversedNumberInIntList = new ArrayList();

        int reversedNumber = 0;
        String[] givenNumberSplitted = givenNumber.split("");
        int lengthOfSplittedArray= givenNumberSplitted.length-1;
        for(int i=lengthOfSplittedArray; i>=0;i--){
            String splittednumber=givenNumberSplitted[i];
            reversedNumberInString.add(splittednumber);
        }
            //zmiana listy stringów na liste intów
        for(String current:reversedNumberInString){
            reversedNumberInIntList.add(Integer.parseInt(current));
        }

        int[] reversedNumberInIntArray(List<Integer> reversedNumberInIntList) {
            int[] ret = new int[reversedNumberInIntList.size()];
            for(int i = 0; i < ret.length; i++)
                ret[i] = reversedNumberInIntList.get(i);
            return ret;
        } //watafuq is that co to za bledy
        //odnośnik https://stackoverflow.com/questions/960431/how-can-i-convert-listinteger-to-int-in-java
        System.out.println(reversedNumberInIntArray);


   /*         if (givenNumber == reversedNumber) {
                System.out.println(i);
                return;
            } else {
                reversedNumber = 0;
                givenNumber++;
            }
   */
    }
}