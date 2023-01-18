
import java.util.Scanner;
import java.util.stream.Stream;
//https://pl.spoj.com/problems/JPESEL/

public class PeselCheck {
    public static int[] disassemblePesel(String pesel) {
        return Stream.of(pesel.split("")).mapToInt(Integer::parseInt).toArray();
    }

    public static boolean validatePesel(String pesel) {
        int[] disassembledPesel = disassemblePesel(pesel);
        int peselSum = (disassembledPesel[1] * 3) +
                (disassembledPesel[5] * 3) +
                (disassembledPesel[9] * 3) +
                (disassembledPesel[2] * 7) +
                (disassembledPesel[6] * 7) +
                (disassembledPesel[3] * 9) +
                (disassembledPesel[7] * 9) +
                disassembledPesel[0] +
                disassembledPesel[4] +
                disassembledPesel[8] +
                disassembledPesel[10];

        return Integer.toString(peselSum).endsWith("0");
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
