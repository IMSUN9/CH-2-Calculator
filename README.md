# Java Calculator Project

## 1. 프로젝트 소개
이 프로젝트는 Java의 객체지향 개념을 학습하며 만든 **콘솔 기반 계산기 프로그램**입니다.  
사용자가 두 개의 숫자와 연산자를 입력하면 사칙연산을 수행하고, 결과를 저장 및 조회할 수 있습니다.

단순히 계산만 하는 것이 아니라,
- 연산 기능을 클래스 단위로 분리하고
- 연산 결과를 컬렉션에 저장하며
- Enum, Generic, Lambda, Stream 등의 Java 문법을 적용하여  
  기본 기능과 도전 기능까지 구현한 프로젝트입니다.

---

## 2. 개발 목적
이 프로젝트를 통해 다음 내용을 학습하는 것을 목표로 했습니다.

- Java 기본 문법 이해
- 클래스와 메서드 분리
- 객체지향적인 역할 분담
- 컬렉션(List)을 활용한 데이터 저장
- Enum을 활용한 연산자 관리
- Generic을 활용한 다양한 숫자 타입 처리
- Lambda / Stream을 활용한 조건 기반 결과 조회

---

## 3. 주요 기능

### 필수 기능
- 양의 정수(또는 숫자) 2개 입력
- 사칙연산 수행 (`+`, `-`, `*`, `/`)
- 0으로 나누기 예외 처리
- `exit` 입력 전까지 반복 실행
- 연산 결과를 컬렉션에 저장
- 가장 먼저 저장된 연산 결과 삭제 기능

### 도전 기능
- 연산자를 `Enum`으로 관리
- `Generic<T extends Number>`를 사용하여 다양한 숫자 타입 처리
- `Lambda`와 `Stream`을 활용한 특정 값보다 큰 결과 조회 기능 구현

---

## 4. 사용 기술
- Java
- OOP(Object-Oriented Programming)
- Collection Framework (`List`, `ArrayList`)
- Enum
- Generic
- Lambda Expression
- Stream API

---

## 5. 프로젝트 구조

```bash
src
└── com.example.calculator
    ├── App.java
    ├── ArithmeticCalculator.java
    └── OperatorType.java