import java.util.Scanner;  // Import the Scanner class

//https://www.spoj.com/problems/SMPDIV/
class Divisibility {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int x, y, n;

        for (int z = 0; z < testCases; z++) {
            n = scan.nextInt();
            x = scan.nextInt();
            y = scan.nextInt();
            for (int i = 1; i <= n; i++) {
                int r = i % x;
                int b = i % y;
                if (r == 0 && b != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}