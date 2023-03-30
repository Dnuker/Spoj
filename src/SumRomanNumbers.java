//https://pl.spoj.com/problems/JSUMRZYM/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumRomanNumbers {

    public static List<Integer> convertRomanToArabicDigits(String number) {
        String[] stringArr = number.split("");
        List<Integer> intList = new ArrayList();
        int arraySize = stringArr.length;
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].equals("M")) {
                intList.add(1000);
            } else if (stringArr[i].equals("D")) {
                intList.add(500);
            } else if (stringArr[i].equals("C")) {
                intList.add(100);
            } else if (stringArr[i].equals("L")) {
                intList.add(50);
            } else if (stringArr[i].equals("X")) {
                intList.add(10);
            } else if (stringArr[i].equals("V")) {
                intList.add(5);
            } else if (stringArr[i].equals("I")) {
                intList.add(1);
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
            if (numberToTranslate.get(i) < numberToTranslate.get(i + 1)) {
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
            } else if (arabicNumber >= 900 && arabicNumber < 1000) {
                romanNumber = romanNumber + "CM";
                arabicNumber = arabicNumber - 900;
            } else if (arabicNumber >= 500 && arabicNumber < 900) {
                romanNumber = romanNumber + "D";
                arabicNumber = arabicNumber - 500;
            } else if (arabicNumber >= 400 && arabicNumber < 500) {
                romanNumber = romanNumber + "CD";
                arabicNumber = arabicNumber - 400;
            } else if (arabicNumber >= 100 && arabicNumber < 400) {
                romanNumber = romanNumber + "C";
                arabicNumber = arabicNumber - 100;
            } else if (arabicNumber >= 90 && arabicNumber < 100) {
                romanNumber = romanNumber + "XC";
                arabicNumber = arabicNumber - 90;
            } else if (arabicNumber >= 50 && arabicNumber < 90) {
                romanNumber = romanNumber + "L";
                arabicNumber = arabicNumber - 50;
            } else if (arabicNumber >= 40 && arabicNumber < 50) {
                romanNumber = romanNumber + "XL";
                arabicNumber = arabicNumber - 40;
            } else if (arabicNumber >= 10 && arabicNumber < 40) {
                romanNumber = romanNumber + "X";
                arabicNumber = arabicNumber - 10;
            } else if (arabicNumber >= 9 && arabicNumber < 10) {
                romanNumber = romanNumber + "IX";
                arabicNumber = arabicNumber - 9;
            } else if (arabicNumber >= 5 && arabicNumber < 9) {
                romanNumber = romanNumber + "V";
                arabicNumber = arabicNumber - 5;
            } else if (arabicNumber >= 4 && arabicNumber < 5) {
                romanNumber = romanNumber + "IV";
                arabicNumber = arabicNumber - 4;
            } else if (arabicNumber >= 1 && arabicNumber < 4) {
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
