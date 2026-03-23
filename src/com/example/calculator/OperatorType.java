package com.example.calculator;

public enum OperatorType {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    public static OperatorType fromChar(char operator) {
        if (operator == '+') {
            return ADD;
        } else if (operator == '-') {
            return SUBTRACT;
        } else if (operator == '*') {
            return MULTIPLY;
        } else if (operator == '/') {
            return DIVIDE;
        } else {
            throw new IllegalArgumentException("잘못된 연산자입니다.");
        }
    }


}