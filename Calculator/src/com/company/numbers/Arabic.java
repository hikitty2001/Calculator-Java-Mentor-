package com.company.numbers;

public class Arabic extends Numbers{

    // constructors

    public Arabic(String[] inputData) {
        setFirstNumber(Byte.parseByte(inputData[0]));
        setSecondNumber(Byte.parseByte(inputData[2]));
        setOperation(inputData[1]);
    }
}
