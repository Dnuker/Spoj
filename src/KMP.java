
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://pl.spoj.com/problems/KMP/
public class KMP {
    public static char[] convertStringToCharArr(String stringToConvert) {
        return stringToConvert.toCharArray();
    }


    public static List<Integer> findPatternPositionString(String pattern, String phrase){
        List<Integer> patternPosition = new ArrayList();
        //phrase += " ";
        for (int i = 0; i < phrase.length(); i++) {
          //  if (i + pattern.length() < phrase.length()) {
                String phraseSubStr = phrase.substring(i, i + (pattern.length()));
                int forlater = i+pattern.length();
                if(i+pattern.length()>=phrase.length()){
                    phraseSubStr = phrase.substring(i);
                    if (phraseSubStr.equals(pattern)) {
                        patternPosition.add(i);
                        break;
                    }
                }
                if (phraseSubStr.equals(pattern)) {
                    patternPosition.add(i);
               }
           /* }
            else {
                break;
           }*/
        }
        return patternPosition;
    }

    public static List<Integer> findPatternPositionPKD(char[] pattern, char[] phrase) {
        List<Integer> patternPosition = new ArrayList();
        int next = 0;
        for(int phI = 0 ; phI < phrase.length ; phI++){
            for( int paI = 0 ; paI < pattern.length ; paI++){
                if(phI != phrase.length -1){
                    if(phrase[phI+next] == pattern[paI]){
                        if(next == pattern.length){
                            //dodaj do listy pozycje
                            patternPosition.add(phI);
                            next = 0;
                            break;
                        }
                        next ++;
                    }else{
                        break;
                    }
                }
            }
        }
       return patternPosition;
    }

    public static List<Integer> findPatternPosition(char[] pattern, char[] phrase) {
        int patternLength = pattern.length;
        int phraseLength = phrase.length;
        List<Integer> patternPosition = new ArrayList();
        int iterationNumber = 1;
        int startNumber = 0;
        for (int i = 0; i < phraseLength; i++) {
            if (phrase[i] == pattern[0]) {

                for (int j = 1; j < patternLength; j++) {
                    if (i != phraseLength - 1) {
                        i++;
                        if (iterationNumber == 1) {
                            startNumber = i;
                        }
                        if (phrase[i] == pattern[j]) {
                            iterationNumber++;
                            if (iterationNumber == patternLength) {
                                patternPosition.add(i - (patternLength - 1));
                                iterationNumber = 1;
                                i = startNumber;
                            }
                        } else {
                            i--;
                            iterationNumber++;
                        }
                    } else {
                        break;
                    }

                }
            }
        }

        return patternPosition;
    }

    public static void printList(List<Integer> patternPosition) {
        for (Integer integer : patternPosition) {
            System.out.println(integer);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testnum = scan.nextInt();
        for (int a = 0; a < testnum; a++) {
            int patternLength = scan.nextInt();
            String pattern = scan.next();
            String textToFindPattern = scan.next();
           // List<Integer> patternPosition = findPatternPosition(convertStringToCharArr(pattern), convertStringToCharArr(textToFindPattern));
            List<Integer> patternPosition = findPatternPositionString(pattern,textToFindPattern);
            printList(patternPosition);
        }
    }
}