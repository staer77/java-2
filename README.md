# 이주환 202230126

####
1. 이름 학번 h1 제일 위에 기재
2. 날짜(수차)
3. 배운내용 & 코드
4. 최근 날짜가 제일 위로 올라오게

## 25년 4월 17일(7주차)
* 

```

```

## 25년 4월 10일(6주차)
* Class and Object
* object - 특성{state - 캡슐화(Encapsulation), 상속(Inheritance), 다형성(Polymorphism)}, 행위(behavior), 상호작용(Interaction)
* Overloading - "한 클래스 내"에서 동일 명이지만 다르게 작동하는 여러 메소드, Overriding - 슈퍼 클래스의 메소드를 동일 명으로 "서브 클래스마다 다르게" 구현
* 객체 지향 언어의 목적 1. 소프트웨어 생산성 향상2.실세계에 대한 쉬운 모델링
* 절차 지향, 객체 지향 프로그래밍의 특징
* class : 객체의 속성과 행위 선언. 객체의 설계도 혹은 틀, object : 클래스의 틀로 찍어낸 실체
* 메모리 공간을 갖는 구체적인 실체 instane라고도 부름
* class 구성 요소 외부(package, import, external class), 내부(field(멤버 변수), method(멤버 함수), constructor, inner class, this 키워드, this() 매서드)
* 객체 생성과 활용 1. 래퍼런스 변수 선언 2. 객체 생성 new 연산자 이용 3. 객체 멤버 접근 점(.) 연산자 이용
* 생성자(객체가 생성될 때 초기화 목적으로 실행되는 메소드)
* 생성자 목적은 객체 생성 시 초기화, 리턴 타입을 지정할 수 없음

```
public class Ex41Circle {
    int radius;
    String name;

    public double getArea() { // 멤버 메소드
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Ex41Circle pizza;
        pizza = new Ex41Circle(); // Circle 객체 생성
        pizza.radius = 10; // 피자 반지름을 10으로 설정
        pizza.name = "자바피자"; // 피자의 이름 설정
        double area = pizza.getArea(); // 피자의 면적 알아내기
        System.out.println(pizza.name + "의 면적은 " + area);

        Ex41Circle donut = new Ex41Circle(); // Circle 객체 생성, 이 방법을 많이 사용함
        donut.radius = 2; // 도넛의 반지름을 2로 설정
        donut.name = "자바도넛"; // 도넛의 이름 설정
        area = donut.getArea(); // 도넛의 면적 알아내기
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
```

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