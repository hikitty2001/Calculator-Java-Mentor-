package com.company;

import com.company.numbers.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] inputData = new String[3];

        for (int i = 0; i < inputData.length; i++) inputData[i] = input.next();

        input.close();

        Numbers numbers = new Numbers();

        numbers.isCorrect(inputData);
        //System.out.println("operator is " + inputData[1] + "result is = " + numbers.getResult());

        if (numbers.isArabic()) {
            Arabic arabic = new Arabic(inputData);
            System.out.println(arabic.getResult());
        } else if (!numbers.isArabic()) { // сорри за костыль :)
            Roman roman = new Roman(inputData);
                if (roman.getResult() > 0) System.out.println((roman.toRoman(roman.getResult())));
                    else if (roman.getResult() < 0) System.out.println("-" + (roman.toRoman(-1 * roman.getResult())));
                        else System.out.println(0);
        } else {
            System.out.println("Некорректный ввод");
            System.exit(0);
        }
    }
}
