package com.example.calculator;

import java.util.List;
import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> {

    // 연산 결과를 저장하는 컬렉션
    private List<Double> results = new ArrayList<>();

    // Getter
    public List<Double> getResults() {
        return results;
    }

    // Setter
    public void setResults(List<Double> results) {
        this.results = results;
    }

    // 가장 먼저 저장된 결과 삭제
    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

    // 제네릭 타입 T를 받아 계산 수행
    public double calculate(T num1, T num2, OperatorType operatorType) {

        // Number 타입은 공통적으로 doubleValue()를 쓸 수 있음
        double num1Double = num1.doubleValue();
        double num2Double = num2.doubleValue();

        double result = 0;

        if (operatorType == OperatorType.ADD){
            result = num1Double + num2Double;
        } else if (operatorType == OperatorType.SUBTRACT) {
            result = num1Double - num2Double;
        } else if (operatorType == OperatorType.MULTIPLY) {
            result = num1Double * num2Double;
        } else if (operatorType == OperatorType.DIVIDE) {
            result = num1Double / num2Double;
        }

        results.add(result);
        return result;
    }

}