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

            String[] splitStr = numInput.split("\\s+");
             //System.out.println(arraysize);
            //for (int index = 0; index < arraysize; index++) {
                //tworzy tablice zaleznie od tego ile znakow wpiszemy
            int wartosci= splitStr.length;
                for (int x = arraysize; x >= 0; x--) {

                    String[] numbers = new String[arraysize];


                    String value = splitStr[wartosci-1];
                    numbers[arraysize-1] = value;
                    System.out.println(value);

                    wartosci--;
                    if (wartosci==0)
                    {
                        break;
                    }
                    // System.out.println(index);
               // }
            }
        }
    }

}
