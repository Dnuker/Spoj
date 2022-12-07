import java.util.Scanner;
// https://pl.spoj.com/problems/VSR/


public class AverageSpeed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int testCaseCount = scan.nextInt();
        if (testCaseCount >= 1 && testCaseCount <= 1000) {
            for (int i = 0; i < testCaseCount; i++) {
                String speeds = scan.next(); //Takes 2 numbers: ex 12 14
                String[] speedSplitted = speeds.split("\\s+");
                int s1 = Integer.parseInt(speedSplitted[0]);
                int s2 = Integer.parseInt(speedSplitted[1]);
                if (s1 >= 1 && s2 >= 1 && s1 <= 10000 && s2 <= 10000) {
                    float averageSpeed = (float)(s1 + s2) / 2f;
                    System.out.println(averageSpeed);
                }
            }
        } else {
            System.out.println("Podaj prawidłową liczbę");

        }
    }
}

