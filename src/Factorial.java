import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
//https://pl.spoj.com/problems/FCTRL3/

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        List<Integer> factorialNumList = new ArrayList();

        //for na testcases
        for (int x = 0; x < testCases; x++) {
            int factorialnum = scan.nextInt();
            int result = 1;
            for (int i = 1; i <= factorialnum; i++) {
                result = result * i;
            }
            factorialNumList.add(result);
        }
        int listSize = factorialNumList.size();
        for (int x = 0; x < listSize; x++) {
            String resultInString = Integer.toString(factorialNumList.get(x));
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

