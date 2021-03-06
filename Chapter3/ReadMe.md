# CH03 자바의 여러 가지 연산자

## 항과 연산자
- 항(operand) : 연산에 사용되는 값
- 연산자(operator) : 항을 이용하여 연산하는 기호

## 대입 연산자
- 변수에 값을 대입 하는 연산자
- 연산의 결과를 변수에 대입
- 우선 순위가 가장 낮은 연산자
- 왼쪽 변수에 오른쪽 변수를 대입
```Java
int age = 24   //age 변수에 24를 대입
```
## 부호 연산자
- 양수/음수의 표현, 값의 부호를 변경

## 산술 연산자
- / : 나눗셈의 몫을 구함
- % : 나눗셈의 나머지를 구함

## 증가 감소 연산자
- 1만큼 더하거나 1만큼 뺄 때 사용하는 연산자
- 항의 앞/뒤 위치에 따라 연산의 결과가 달라짐에 유의

## 관계 연산자 / 논리 연산자
- 연산의 결과가 true(참), false(거짓)으로 반환

## 단락 회로 평가(short circuit evaluation)
- 논리 곱(&&)은 두 항이 모두 true일 때만 결과가 true
- 논리 합(||)은 두 항이 모두 false일 때만 결과가 false
```Java
int num1=10;
int i=2;
boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
System.out.println(i);
//논리 곱에서 앞 항의 결과 값이 거짓이므로 i=i+2 문장은 실행되지 않아 2로 출력
```

## 복합 대입 연산자
```Java
num1+=2;    //num1=num1+2;
num1-=2;    //num1=num1-2;
num1/=2;    //num1=num1/2;
num1%=2;    //num1=num1%2;
``` 

## 조건 연산자
- 삼항 연산자
- 조건 식의 결과가 true(참)인 경우와 false(거짓)인 경우에 따라 다른 식이나 결과가 수행
- 제어문 중 조건문을 간단히 표현할 때 사용
```Java
조건식 ? 결과1 : 결과2
//조건식이 참이면 결과1, 조건식이 거짓이면 결과2가 선택
```

## 비트 연산자
- 정수에만 사용
```
&(AND) : 두 비트가 모두 1인 경우만 1
|(OR) : 두 비트가 모두 0인 경우만 0
^(XOR) : 두 비트가 다른 값이면 1
~(반전) : 0은 1 1은 0
<<(왼쪽 shift) : 오른쪽에서 왼쪽
>>(오른쪽 shift) : 왼쪽에서 오른쪽
<<<.>>> : 채워지는 비트가 부호와 상관없이 0
```

## 연산자 우선 순위
1. 일차식
2. 단항
3. 산술
4. 비트이동
5. 관계
6. 비트 곱
7. 비트 차
8. 비트 합
9. 논리 곱
10. 논리 합
11. 조건
12. 대입
