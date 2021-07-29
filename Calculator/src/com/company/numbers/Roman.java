package com.company.numbers;

import java.util.TreeMap;

public class Roman extends Numbers {

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    // constructors

    public Roman(String[] inputData) {
        setFirstNumber(inputData[0]);
        setSecondNumber(inputData[2]);
        setOperation(inputData[1]);
    }

    public Roman() {} // for debug

    // methods

    public void setFirstNumber(String number) {
        super.setFirstNumber(toArabic(number));
    }


    public void setSecondNumber(String number) {
        super.setSecondNumber(toArabic(number));
    }

    //

    byte toArabic(String number) {
        switch (number) {
            case "I"    : return 1;
            case "II"   : return 2;
            case "III"  : return 3;
            case "IV"   : return 4;
            case "V"    : return 5;
            case "VI"   : return 6;
            case "VII"  : return 7;
            case "VIII" : return 8;
            case "IX"   : return 9;
            case "X"    : return 10;
            default     : return 0;
        }
    }

    public String toRoman(int number) {
        int l = map.floorKey(number);
        if (number == l) return map.get(number);

        return map.get(l) + toRoman(number-l);
    }

    //
}
