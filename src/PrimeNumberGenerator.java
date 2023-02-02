import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PrimeNumberGenerator {

    public static List<Integer> dividesByTwoThreeFiveSeven(int startNumber, int endNumber) {
        List<Integer> listOfDividedNumbers = new ArrayList();
        if(startNumber<=7){
            listOfDividedNumbers.add(2);
            listOfDividedNumbers.add(3);
            listOfDividedNumbers.add(5);
            listOfDividedNumbers.add(7);
        }
        for (int i = startNumber; i <= endNumber; i++) {
            if(i==1){
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
    }


 public static List<Integer> deletesMultipliedNumbers(List<Integer> listOfDividedNumbers, int endNumber) {

     int numberMultiplied = 0;
     for (int i = 0; i<listOfDividedNumbers.size(); i++) {

         for (int j = 2; j < Math.sqrt(endNumber); j++) {
             int numberOnId = listOfDividedNumbers.get(i);

             numberMultiplied =  numberOnId * j;
             listOfDividedNumbers.remove(Integer.valueOf(numberMultiplied));

         }
     }
     return listOfDividedNumbers;
 }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startNumber = scan.nextInt();
        int endNumber = scan.nextInt();
        List<Integer> listOfDividedNumbers = dividesByTwoThreeFiveSeven(startNumber,endNumber);

        System.out.print(deletesMultipliedNumbers(listOfDividedNumbers,endNumber));
    }

}
