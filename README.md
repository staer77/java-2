# 이주환 202230126

####
1. 이름 학번 h1 제일 위에 기재
2. 날짜(수차)
3. 배운내용 & 코드
4. 최근 날짜가 제일 위로 올라오게

## 25년 4월 3일(5주차)
* 반복문과 배열, 예외처리
* for, while, do-while
* 배열 선언 및 생성, 인덱스, 원소 접근
* 배열의 크기, length 필드, for-each(배열이나 나열(enumeration)의 원소를 순차 접근하는데 유용한 for문)
* 2차원 배열
* 메소드의 배열 리턴(배열의 래퍼런스만 리턴되며, 전체가 리턴되는 것이 아님)
* try-catch-finally

```
public class Ex31ForSample {
    public static void main(String[] args) {
        int i, sum = 0;

        for (i = 0; i <= 10; i++) { // 1 ~ 10 까지 반복
            sum += 1;
            System.out.println(i); // 더하는 수 출력

            if (i <= 9) {  // 1 ~ 9 까지는 '+' 출력
                System.out.println("+");
            } else {  // i가 10인 경우
                System.out.println("=");  // '=' 출력하고
                System.out.println(sum); // 덧셈 결과 출력
            }
        }
    }
}
```

## 25년 3월 27일(4주차)
* 자바의 특징
* Source Code, Bytecode, Machine code, JIT
* 자바 프로그램의 기본 구조
* identifier - Naming Convention
* Primitive Type, Reference Type
* Memory Structure : heap - FIFO , stack - LIFO
* variable / constant declaration
* print문 종류
* type casting
* System.in vs. Scanner
* operator 대입, 비교, 연산, 논리
* conditional
```
public class Bar {
    public static void main(String[] args) {
        final double PI = 3.14;
        double radius = 10.2;
        double circleArea = radius * radius * PI;

        System.out.print("반지름 " + radius + ", ");
        System.out.println("원의 면적 = " + circleArea);
    }
}
```

## 25년 3월 20일(3주차)
- 자바 프로젝트 생성
* 프로그램 언어의 패러다임 변화 공부
(절차 지향 언어 -> 객채 지향 언어 -> 함수 지향 언어)
* 프로그래밍 언어의 진화
* 프로그래밍과 컴파일
* 자바의 태동(플랫폼 종속성, 독립성 WORA, 바이트 코드(.class), JVM)
* 모듈 프로그래밍
* InnerClass
## 25년 3월 13일(2주차)
```
git 사용법 공부

마크다운 사용법

# h1 tag
## h2 tag
### 가가
#### 나나
##### 노노

<!-- 주석 -->

---

* 가가가
- 나나나

1. 가가가
2. 나나나

```