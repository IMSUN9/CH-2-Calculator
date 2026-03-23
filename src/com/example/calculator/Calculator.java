package com.example.calculator;

import java.util.List;
import java.util.ArrayList;

public class Calculator {

    private List<Integer> results = new ArrayList<>();

    public int calculate(int num1, int num2, char operator) {

        int result = 0;

        if (operator == '+'){
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
            }

        results.add(result);

        return result;
    }

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }


}