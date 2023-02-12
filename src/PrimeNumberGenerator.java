import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://pl.spoj.com/problems/PRIME1/
public class PrimeNumberGenerator {

  /*  public static List<Integer> dividesByTwoThreeFiveSeven(int endNumber) {
        List<Integer> listOfDividedNumbers = new ArrayList();
        int startNumber = 2;
        if (startNumber <= 7) {
            listOfDividedNumbers.add(2);
            listOfDividedNumbers.add(3);
            listOfDividedNumbers.add(5);
            listOfDividedNumbers.add(7);
        }
        for (int i = startNumber; i <= endNumber; i++) {
            if (i == 1) {
                i++;
            }
            if (i % 2 != 0) {
                if (i % 3 != 0) {
                    if (i % 5 != 0) {
                        if (i % 7 != 0) {
                            listOfDividedNumbers.add(i);
                        }
                    }
                }
            }
        }
        return listOfDividedNumbers;
    }*/

    public static List<Integer> deletesMultipliedNumbers(int endNumber) {
        List<Integer> listOfDividedNumbers = new ArrayList();
        for(int number = 2;number<=endNumber;number++){
            listOfDividedNumbers.add(number);
        }
        //List<Integer> justForCheck = listOfDividedNumbers;
        int numberMultiplied = 0;
        for (int i = 2; i < endNumber; i++) {
            for (int j = 2; j < Math.sqrt(endNumber); j++) {
                numberMultiplied = i * j;
                listOfDividedNumbers.remove(Integer.valueOf(numberMultiplied));
            }
        }
        return listOfDividedNumbers;
    }

    public static List<Integer> takeCompartmentOfNumbers(List<Integer> listOfNumbers, int startNumber) {
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
            List<Integer> listOfDividedNumbers = deletesMultipliedNumbers(endNumber);
            List<Integer> listOfPrimeNumbers = takeCompartmentOfNumbers(listOfDividedNumbers, startNumber);
            System.out.print(listOfPrimeNumbers);
        }
    }

}
