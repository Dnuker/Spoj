import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://pl.spoj.com/problems/PRIME1/
public class PrimeNumberGenerator {
    public static List<Boolean> findPrimeNumbersAsBoolean(int endNumber) {
        List<Boolean> primeNumbersAsBoolean = new ArrayList();
        for (int number = 2; number <= endNumber; number++) {
            primeNumbersAsBoolean.add(true);
        }
        int numberMultiplied = 0;
        for (int i = 2; i < endNumber; i++) {
            for (int j = 2; j < Math.sqrt(endNumber); j++) {
                numberMultiplied = (i * j) - 2;
                if (numberMultiplied > primeNumbersAsBoolean.size() - 1) {
                    break;
                }
                primeNumbersAsBoolean.set(numberMultiplied, false);
            }
        }
        return primeNumbersAsBoolean;
    }

    public static List<Integer> convertsBooleanListToInt(List<Boolean> primeNumbersAsBoolean, int startNumber) {
        List<Integer> primeNumbers = new ArrayList();
        for (int i = 0; i < primeNumbersAsBoolean.size(); i++) {
            if (primeNumbersAsBoolean.get(i)) {
                primeNumbers.add(i + 2);
            }
        }
        return primeNumbers;
    }

    public static List<Integer> findPrimeNumbers(int endNumber) {
        List<Integer> primeNumbers = new ArrayList();
        for (int number = 2; number <= endNumber; number++) {
            primeNumbers.add(number);
        }

        int numberMultiplied = 0;
        for (int i = 2; i < endNumber; i++) {
            for (int j = 2; j < Math.sqrt(endNumber); j++) {
                numberMultiplied = i * j;
                primeNumbers.remove(Integer.valueOf(numberMultiplied));
            }
        }
        return primeNumbers;
    }

    public static List<Integer> rangePrimeNumbers(List<Integer> listOfNumbers, int startNumber) {
        int sizeOfList = listOfNumbers.size();
        for (int i = 0; i < sizeOfList; i++) {
            if (listOfNumbers.get(0) < startNumber) {
                listOfNumbers.remove(0);
            }
        }
        return listOfNumbers;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCaseCount = scan.nextInt();
        for (int i = 0; i < testCaseCount; i++) {
            int startNumber = scan.nextInt();
            int endNumber = scan.nextInt();
            List<Boolean> primeNumbersAsBoolean = findPrimeNumbersAsBoolean(endNumber);
            List<Integer> primeNumbersAsInt = convertsBooleanListToInt(primeNumbersAsBoolean, startNumber);
         /*   List<Integer> primeNumbers = findPrimeNumbers(endNumber);
            List<Integer> primeNumbersInRange = rangePrimeNumbers(primeNumbers, startNumber);*/
            System.out.print(rangePrimeNumbers(primeNumbersAsInt, startNumber));
        }
    }
}
