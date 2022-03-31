import java.util.Scanner;
import java.util.Arrays;
//https://pl.spoj.com/problems/PP0502B/

public class Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Wprowadź liczbe testów");
        int testnum = scan.nextInt();
        for (int a = 0; a < testnum; a++) {
            String numInput = scan.next();
            String[] splitStr = numInput.split("\\s+");
            //tworzy tablice zaleznie od tego ile znakow wpiszemy
            int wartosci = splitStr.length;
            String[] numbers = new String[splitStr.length];
            for (int x = 0; x < splitStr.length; x++) {
                numbers[x] = splitStr[wartosci - 1];
                wartosci--;
                if (x == splitStr.length) {
                    break;
                }
            }
            System.out.println(Arrays.toString(numbers));


        }
    }

}
