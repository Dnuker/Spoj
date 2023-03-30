//https://pl.spoj.com/problems/JSUMRZYM/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumRomanNumbers {

    public static List<Integer> convertRomanToArabicDigits(String number) {
        String[] stringArr = number.split("");
        List<Integer> intList = new ArrayList();
        for (String s : stringArr) {
            switch (s) {
                case "M" -> intList.add(1000);
                case "D" -> intList.add(500);
                case "C" -> intList.add(100);
                case "L" -> intList.add(50);
                case "X" -> intList.add(10);
                case "V" -> intList.add(5);
                case "I" -> intList.add(1);
            }
        }
        return intList;
    }

    public static int translatesRomanNumberToArabic(List<Integer> numberToTranslate) {
        int arabicNumber = 0;
        for (int i = 0; i < numberToTranslate.size(); i++) {
            if (numberToTranslate.size() == i + 1) {
                arabicNumber = arabicNumber + numberToTranslate.get(i);
                break;
            }
            if (numberToTranslate.get(i) >= numberToTranslate.get(i + 1)) {
                arabicNumber = arabicNumber + numberToTranslate.get(i);
            }
            else {
                arabicNumber = arabicNumber - numberToTranslate.get(i);
            }
        }
        return arabicNumber;
    }

    public static String translateArabicNumberToRoman(int arabicNumber) {
        String romanNumber = "";
        while (true) {
            if (arabicNumber >= 1000) {
                romanNumber = romanNumber + "M";
                arabicNumber = arabicNumber - 1000;
            } else if (arabicNumber >= 900 ) {
                romanNumber = romanNumber + "CM";
                arabicNumber = arabicNumber - 900;
            } else if (arabicNumber >= 500) {
                romanNumber = romanNumber + "D";
                arabicNumber = arabicNumber - 500;
            } else if (arabicNumber >= 400) {
                romanNumber = romanNumber + "CD";
                arabicNumber = arabicNumber - 400;
            } else if (arabicNumber >= 100) {
                romanNumber = romanNumber + "C";
                arabicNumber = arabicNumber - 100;
            } else if (arabicNumber >= 90) {
                romanNumber = romanNumber + "XC";
                arabicNumber = arabicNumber - 90;
            } else if (arabicNumber >= 50) {
                romanNumber = romanNumber + "L";
                arabicNumber = arabicNumber - 50;
            } else if (arabicNumber >= 40) {
                romanNumber = romanNumber + "XL";
                arabicNumber = arabicNumber - 40;
            } else if (arabicNumber >= 10) {
                romanNumber = romanNumber + "X";
                arabicNumber = arabicNumber - 10;
            } else if (arabicNumber >= 9) {
                romanNumber = romanNumber + "IX";
                arabicNumber = arabicNumber - 9;
            } else if (arabicNumber >= 5) {
                romanNumber = romanNumber + "V";
                arabicNumber = arabicNumber - 5;
            } else if (arabicNumber >= 4) {
                romanNumber = romanNumber + "IV";
                arabicNumber = arabicNumber - 4;
            } else if (arabicNumber >= 1) {
                romanNumber = romanNumber + "I";
                arabicNumber = arabicNumber - 1;
            } else if (arabicNumber == 0) {
                return romanNumber;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstNumber = scan.next();
        String secondNumber = scan.next();
        int firstNumberAsArabic = translatesRomanNumberToArabic(convertRomanToArabicDigits(firstNumber));
        int secondNumberAsArabic = translatesRomanNumberToArabic(convertRomanToArabicDigits(secondNumber));

        System.out.println(translateArabicNumberToRoman(firstNumberAsArabic + secondNumberAsArabic));
    }
}
