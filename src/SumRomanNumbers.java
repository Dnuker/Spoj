//https://pl.spoj.com/problems/JSUMRZYM/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumRomanNumbers {
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

    public static List<Integer> convertStringToIntList(String number) {
        String[] stringArr = number.split("");
        List<Integer> intList = new ArrayList();
        int arraySize = stringArr.length;
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].equals("M")) {
                intList.add(1000);
            }
            if (stringArr[i].equals("D")) {
                intList.add(500);
            }
            if (stringArr[i].equals("C")) {
                intList.add(100);
            }
            if (stringArr[i].equals("L")) {
                intList.add(50);
            }
            if (stringArr[i].equals("X")) {
                intList.add(10);
            }
            if (stringArr[i].equals("V")) {
                intList.add(5);
            }
            if (stringArr[i].equals("I")) {
                intList.add(1);
            }
        }

        return intList;
    }

    public static String translateArabicNumberToRoman(int arabicNumber) {

        String romanNumber = null;
        if (arabicNumber >= 1000) {
            romanNumber = romanNumber + "M";
            arabicNumber = arabicNumber - 1000;
        }
        if (arabicNumber >= 900) {
            romanNumber = romanNumber + "CM";
            arabicNumber = arabicNumber - 900;
        }
        if (arabicNumber >= 500) {
            romanNumber = romanNumber + "D";
            arabicNumber = arabicNumber - 500;
        }
        if (arabicNumber >= 400) {
            romanNumber = romanNumber + "CD";
            arabicNumber = arabicNumber - 400;
        }
        if (arabicNumber >= 100) {
            romanNumber = romanNumber + "C";
            arabicNumber = arabicNumber - 100;
        }
        if (arabicNumber >= 90) {
            romanNumber = romanNumber + "XC";
            arabicNumber = arabicNumber - 90;
        }
        if (arabicNumber >= 50) {
            romanNumber = romanNumber + "L";
            arabicNumber = arabicNumber - 50;
        }
        if (arabicNumber >= 40) {
            romanNumber = romanNumber + "XL";
            arabicNumber = arabicNumber - 40;
        }
        if (arabicNumber >= 10) {
            romanNumber = romanNumber + "X";
            arabicNumber = arabicNumber - 10;
        }
        if (arabicNumber >= 9) {
            romanNumber = romanNumber + "IX";
            arabicNumber = arabicNumber - 9;
        }
        if (arabicNumber >= 5) {
            romanNumber = romanNumber + "V";
            arabicNumber = arabicNumber - 5;
        }
        if (arabicNumber >= 4) {
            romanNumber = romanNumber + "IV";
            arabicNumber = arabicNumber - 4;
        }
        if (arabicNumber >= 1) {
            romanNumber = romanNumber + "I";
            arabicNumber = arabicNumber - 1;
        }
        return romanNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstNumber = scan.next();
        String secondNumber = scan.next();
        int sumOfNumbers = translatesRomanNumberToArabic(convertStringToIntList(firstNumber)) + translatesRomanNumberToArabic(convertStringToIntList(secondNumber));


        System.out.println(sumOfNumbers);
    }
}
