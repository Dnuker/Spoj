import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
//https://pl.spoj.com/problems/FCTRL3/

public class Factorial {
    public static int calculateFactorial(int number) {
        int result = 1;

        for (int j = 1; j <= number; j++) {
            result = result * j;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> factorialNumList = new ArrayList();
        //for na testcases
        int testCases = scan.nextInt();
        for (int i = 0; i < testCases; i++) {
            int factorialNum = scan.nextInt();
            int calculatedFactorial = calculateFactorial(factorialNum);
            factorialNumList.add(calculatedFactorial);
        }
        for (int i = 0; i < factorialNumList.size(); i++) {
            String resultInString = Integer.toString(factorialNumList.get(i));
            String[] resultInStringSplitted = resultInString.split("");
            int maxLengthOfTable = resultInStringSplitted.length;
            if (maxLengthOfTable < 2) {
                System.out.println("0 " + resultInStringSplitted[maxLengthOfTable - 1]);
            } else {
                System.out.println(resultInStringSplitted[maxLengthOfTable - 2] + " " + resultInStringSplitted[maxLengthOfTable - 1]);
            }
        }
    }


}

