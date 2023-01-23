
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://pl.spoj.com/problems/KMP/
public class KMP {
    public static char[] convertStringToCharArr(String stringToConvert) {
        return stringToConvert.toCharArray();
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
            List<Integer> patternPosition = findPatternPosition(convertStringToCharArr(pattern), convertStringToCharArr(textToFindPattern));
            printList(patternPosition);
        }
    }
}

