
import java.util.Scanner;
import java.util.stream.Stream;

public class PeselCheck {
    public static int[] disassemblePesel(String pesel) {
        int[] intArr = Stream.of(pesel.split("")).mapToInt(Integer::parseInt).toArray();
        return intArr;
    }

    public static boolean validatePesel(String pesel) {
        int[] disassembledPesel = disassemblePesel(pesel);
        int multipliedByThree = (disassembledPesel[1] * 3) + (disassembledPesel[5] * 3) + (disassembledPesel[9] * 3);
        int multipliedBySeven = (disassembledPesel[2] * 7) + (disassembledPesel[6] * 7);
        int multipliedByNine = (disassembledPesel[3] * 9) + (disassembledPesel[7] * 9);
        int peselSum = multipliedByThree + multipliedBySeven + multipliedByNine + disassembledPesel[0] + disassembledPesel[4] + disassembledPesel[8] + disassembledPesel[10];
        String peselSumInString = Integer.toString(peselSum);
        int[] disassembledPeselSum = new int[peselSumInString.length()];
        for (int i = 0; i < peselSumInString.length(); i++) {
            disassembledPeselSum[i] = peselSumInString.charAt(i) - '0';
        }
        int thirdNumber = disassembledPeselSum[2];
        if (thirdNumber == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCaseCount = scan.nextInt();
        for (int i = 0; i < testCaseCount; i++) {
            String pesel = scan.next();

            if (validatePesel(pesel)) {
                System.out.println("T");
            } else {
                System.out.println("N");
            }
        }
    }
}
