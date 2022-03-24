import java.util.Scanner;
//https://pl.spoj.com/problems/PP0502B/

public class Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ;
        System.out.println("Wprowadź liczbe testów");
        int testnum = scan.nextInt();

        for (int a = 0; a < testnum; a++) {
            String numInput = scan.next();
            String numInputWoaSpaces = numInput.replace(" ", "");
            int arraysize = numInputWoaSpaces.length()-1 ;
            int stringLength = numInputWoaSpaces.length() ;
             //System.out.println(arraysize);
            //for (int index = 0; index < arraysize; index++) {
                //tworzy tablice zaleznie od tego ile znakow wpiszemy

                for (int x = arraysize; x >= 0; x--) {

                    char[] numbers = new char[arraysize];
                    char value = numInputWoaSpaces.charAt(x);
                    numbers[arraysize-1] = value;
                    System.out.println(value);
                    // System.out.println(index);
               // }
            }
        }
    }

}
