package com.example.calculator;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArithmeticCalculator<Number> calculator = new ArithmeticCalculator<>();

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            String input1 = scanner.next();

            System.out.print("두 번째 숫자를 입력하세요: ");
            String input2 = scanner.next();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0);

            Number num1 = parseNumber(input1);
            Number num2 = parseNumber(input2);

            // 나눗셈에서 분모가 0인지 먼저 검사
            if (operator == '/' && num2.doubleValue() == 0)
            {
                System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                continue;
            }

            // 여기서 char -> enum 변환
            OperatorType operatorType = OperatorType.fromChar(operator);

            // 이제 Calculator에 enum을 넘김
            double result = calculator.calculate(num1, num2, operatorType);

            System.out.println("결과: " + result);

            scanner.nextLine(); // 남아 있는 엔터 제거

            System.out.print("가장 먼저 입력된 결과를 삭제하시겠습니까? (remove 입력시 삭제): ");
            String removeAnswer = scanner.nextLine();

            if (removeAnswer.equals("remove")){
                calculator.removeResult();
                System.out.println("삭제 후 결과 목록: " + calculator.getResults());
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String answer = scanner.nextLine();

            if(answer.equals("exit"))
            {
                break;
            }
        }

        scanner.close();
    }

    // 입력값이 정수면 Integer, 실수면 Double로 변환
    private static Number parseNumber(String number){
        if (number.contains(".")) {
            return Double.parseDouble(number);
        } else {
            return Integer.parseInt(number);
        }
    }

}