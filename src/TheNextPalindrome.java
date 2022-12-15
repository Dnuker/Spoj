import java.util.Scanner;
//https://www.spoj.com/problems/PALIN/

public class TheNextPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int givenNumber = scan.nextInt();
        int reversedNumber = 0;


        for (int i = givenNumber; i >= givenNumber; i++) {
            int givenNumberForWhileLoop = i;
            //while whitch reverses the number
            while (givenNumberForWhileLoop != 0) {
                int digit = givenNumberForWhileLoop % 10;
                reversedNumber = reversedNumber * 10 + digit;
                givenNumberForWhileLoop /= 10;
            }

            if (givenNumber == reversedNumber) {
                System.out.println(i);
                System.exit(0);
            } else {
                reversedNumber = 0;
                givenNumber++;
            }
        }
    }
}