package com.company.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {

    private static byte firstNumber = 0;
    private static byte secondNumber = 0;
    private static int result = 0;

    private static byte operation = 1; // 1 - sum, 2 - dif, 3 - mul, 4 - div

    private boolean isArabicFirst = true;
    private boolean isArabicSecond = false;
    private boolean isCorrect = false;

    // constructors

    //

    // operations

    private void addition() {
        result = (firstNumber + secondNumber);
    }

    private void difference() {
        result = (firstNumber - secondNumber);
    }

    private void multiplication() {
        result = (firstNumber * secondNumber);
    }

    private void division() throws RuntimeException {
        try {
            result = (firstNumber / secondNumber);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }

    public int getResult() {
        switch (operation) {
            case 1 :
                addition();
                break;
            case 2 :
                difference();
                break;
            case 3 :
                multiplication();
                break;
            case 4 :
                division();
                break;
        }

        return result;
    }

    public void setFirstNumber(byte number) {
        firstNumber = number;
    }

    public void setSecondNumber(byte number) {
        secondNumber = number;
    }

    public void setOperation(String operator) {
        switch (operator) {
            case "+":
                this.operation = 1;
                break;
            case "-":
                this.operation = 2;
                break;
            case "*":
                this.operation = 3;
                break;
            case "/":
                this.operation = 4;
                break;
        }
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public boolean getIsCorrect() {
        return isCorrect;
    }

    //

    public boolean isArabic() {
        if (isArabicFirst == true && isArabicSecond == true) return true;
        else if (isArabicFirst == false && isArabicSecond == false) return false;
            else {
                System.out.println("Некорректный ввод");
                System.exit(0);
                return false;
        }
    }

    public boolean isCorrect(String[] inputData) {
        switch (inputData[0]) {
            case "1"  :
                isArabicFirst = true;
                break;
            case "2"  :
                isArabicFirst = true;
                break;
            case "3"  :
                isArabicFirst = true;
                break;
            case "4"  :
                isArabicFirst = true;
                break;
            case "5"  :
                isArabicFirst = true;
                break;
            case "6"  :
                isArabicFirst = true;
                break;
            case "7"  :
                isArabicFirst = true;
                break;
            case "8"  :
                isArabicFirst = true;
                break;
            case "9"  :
                isArabicFirst = true;
                break;
            case "10" :
                isArabicFirst = true;
                break;
            default   : switch (inputData[0]) {
                case "I"    :
                    isArabicFirst = false;
                    break;
                case "II"   :
                    isArabicFirst = false;
                    break;
                case "III"  :
                    isArabicFirst = false;
                    break;
                case "IV"   :
                    isArabicFirst = false;
                    break;
                case "V"    :
                    isArabicFirst = false;
                    break;
                case "VI"   :
                    isArabicFirst = false;
                    break;
                case "VII"  :
                    isArabicFirst = false;
                    break;
                case "VIII" :
                    isArabicFirst = false;
                    break;
                case "IX"   :
                    isArabicFirst = false;
                    break;
                case "X"    :
                    isArabicFirst = false;
                    break;
                default     :
                    System.out.println("Некорректный ввод");
                    System.exit(0);
            }
        }

        switch (inputData[2]) {
            case "1":
                isArabicSecond = true;
                break;
            case "2":
                isArabicSecond = true;
                break;
            case "3":
                isArabicSecond = true;
                break;
            case "4":
                isArabicSecond = true;
                break;
            case "5":
                isArabicSecond = true;
                break;
            case "6":
                isArabicSecond = true;
                break;
            case "7":
                isArabicSecond = true;
                break;
            case "8":
                isArabicSecond = true;
                break;
            case "9":
                isArabicSecond = true;
                break;
            case "10":
                isArabicSecond = true;
                break;
            default:
                switch (inputData[2]) {
                    case "I":
                        isArabicSecond = false;
                        break;
                    case "II":
                        isArabicSecond = false;
                        break;
                    case "III":
                        isArabicSecond = false;
                        break;
                    case "IV":
                        isArabicSecond = false;
                        break;
                    case "V":
                        isArabicSecond = false;
                        break;
                    case "VI":
                        isArabicSecond = false;
                        break;
                    case "VII":
                        isArabicSecond = false;
                        break;
                    case "VIII":
                        isArabicSecond = false;
                        break;
                    case "IX":
                        isArabicSecond = false;
                        break;
                    case "X":
                        isArabicSecond = false;
                        break;
                    default:
                        System.out.println("Некорректный ввод");
                        System.exit(0);
                }
        }

        switch (inputData[1]) {
            case "+" :
                operation = 1;
                break;
            case "-" :
                operation = 2;
                break;
            case "*" :
                operation = 3;
                break;
            case "/" :
                operation = 4;
                break;
            default  :
                System.out.println("Некорректный ввод");
                System.exit(0);
        }

        if (inputData.length > 3) {
            System.out.println("Некорректный ввод");
            System.exit(0);
        }

        if (isArabicFirst == isArabicSecond) {
            setIsCorrect(true);
            return true;
        } else {
                System.out.println("Некорректный ввод");
                System.exit(0);
        }

        return false;
    }
}
