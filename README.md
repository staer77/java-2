# 이주환 202230126

####
1. 이름 학번 h1 제일 위에 기재
2. 날짜(주차)
3. 배운내용 & 코드
4. 최근 날짜가 제일 위로 올라오게

## 25년 5월 8일(10주차)
* 추상(abstract) method : 메소드의 코드는 없고 원형만 선언 // abstract public String getName(); <- 추상 메소드
* 추상 클래스 : abstract 선언한 클래스 // abstract class name {} <- 추상 클래스, 인스턴스 생성 불가(객체를 만들 수 없음, 레퍼런스 변수 선언 가능), 추상 클래스를 상속 받으면 추상 클래스 됌 / 서브 클래스도 abstract로 선언해야 함, 추상 클래스 구현 : 서브 클래스에서 슈퍼 클래스의 추상 메소드 구현(오버라이딩) / 추상 클래스 구현한 서브 클래스는 추상 클래스 아님
* 추상 클래스의 목적은 상속을 위한 슈퍼 클래스로 활용하는 것, 서브 클래스에서 추상 메소드 구현, 다형성(이름은 같은데 기능은 다름) 실현
* 자바의 인터페이스는 인터페이스가 맞는 모듈을 조립하듯이 응용프로그램을 작성하기 위해서 사용
* interface 구성 요소 : 상수 , 추상 메소드, 디폴트 메소드, private, static / 변수 빼고 다 됌
* interface 간에 상속 가능, 다중 상속 허용(일반 상속에서는 허용X)
* interface 구현 : 인터페이스의 추상 메소드를 모두 구현한 클래스 작성, implements 키워드 사용, 여러 개의 인터페이스 동시 구현 가능
* package는 클래스 파일들을 묶어 놓은 directory, 하나의 응용프로그램은 1개 이상의 패키지로 작성, jar 파일로 압축 가능
* module은 여러 패키지와 이미지 드으이 자원을 모아 놓은 container, 하나의 모듈을 하나의 .jmod 파일에 저장
* 모듈화 : 클래스들은 패키지로 만들고, 다시 패키지를 모듈로 만듦
* import로 package 사용, 소스에 클래스 이름의 완전 경로명 사용 ex: java.util.Scanner scanner = new java.util.Scanner(System.in);, java.util.*;은 하위 패키지의 클래스는 포함하지 않음
* 소스 파일의 맨 앞에 컴파일 후 저장될 패키지 지정 -> package 패키지명;
* defalut package : package 선언문이 없으면 컴파일러는 클래스나 인터페이스를 디폴트 패키지에 소속 시킴

```
interface PhoneInterface { // 인터페이스 선언
    final int TIMEOUT = 10000; // 상수 필드 선언

    void sendCall(); // 추상 메소드

    void receiveCall(); // 추상 메소드

    default void printLogo() { // 디폴트 메소드
        System.out.println("** Phone **");
    }
    
}

class SamsungPhone implements PhoneInterface { // 인터페이스 구현
    // PhoneInterface의 모든 메소드 구현
    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }

    @Override
    public void receiveCall(){
        System.out.println("전화가 왔습니다다");
    }

    // 메소드 추가 작성
    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    }
    
}

public class Ex56InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}
```

## 25년 4월 18일(9주차, 보강)
* static 제약조건, final class and method
* final 필드 : 상수를 선언할 때 사용
* 상속(inheritance)의 필요성 : 중복 제거, 간결해진 클래스 구조
* 클래스 상속과 객체, extends 키워드 사용, super / sub class 슈퍼클래스에 선언된 필드와 메소드 선언 필요 없음
* 서브 클래스는 슈퍼클래스 객체와 별개, 슈퍼 클래스 멤버는 포함
* 자바 상속 : 하나의 클래스가 둘 이상의 super class를 동시에 상속 받는 것, mutiple inheritance 불허 / interface의 다중 상속 허용, 모호성(Ambiguity) 문제 : 두 부모 클래스에 동명의 멤버(변수나 함수)가 존재할 경우 어떤 걸 호출 해야할 지 모호해짐
* super class의 member에 대한 sub class의 접근, super class member의 Access modifiers
* protected member access : 같은 패키지의 모든 클래스 허용, 상속되는 서브 클래스가 패키지 상관 없이 허용

* super class and sub class 생성자 호출 및 실행 관계
* 서브 클래스 / 슈퍼 클래스의 생성자 호출과 실행, 호출 순서 : 서브 -> 슈퍼, 실행 순서 : 슈퍼 -> 서브, 서브클래스의 객체가 생성될 때 : 생성자 모두 실행

* sub class / super class의 생성자 선택, 각각 여러 개의 생성자 작성 가능, 서브 클래스의 객체가 생성될 때 : super class 1개 / sub class 1개가 실행, 생성자가 결정되는 방식 : 개발자의 명시적 선택 / 컴파일러가 기본 생성자 선택

* 컴파일러에 의해 슈퍼 클래스의 기본 생성자가 묵시적 선택 : 자동으로 슈퍼클래스의 기본 생성자와 짝을 맺음 / 서브 클래스의 매개 변수를 가진 생성자에 대해서도 슈퍼 클래스의 기본 생성자가 자동 선택

* super(parameter)로 슈퍼클래스의 생성자 명시적 선택 : 인자를 이용하여 슈퍼 클래스의 적당한 생성자 호출, 첫 라인에 와야 함

* upcasting : 기본 클래스의 포인터(슈퍼 클래스 래퍼런스)로 파생 클래스의 객체(서브 클래스 객체)를 가리키는 것

* downcastion : 업캐스팅 된 것을 다시 원래대로 되돌리는 것, 슈퍼 클래스 래퍼런스를 서브 클래스 래퍼런스에 대입, 반드시 명시적 타입 변환 지정

* 업캐스팅된 래퍼런스로는 객체의 실제 타입을 구분하기 어려움, 슈퍼클래스는 여러 서브 클래스에 상속되기 때문

* instanceof : 래퍼런스가 가리키는 객체의 타입 식별하기 위해 사용, true/false의 불린 값으로 변환

* method Overriding : 서브 클래에서 슈퍼 클래스의 메소드 중복 작성, 조건은 슈퍼 클래스 메소드의 원형(메소드이름, 인자타입 및 개수, 리턴 타입) 동일하게 작성

* 서브 클래스 객체와 오버라이딩된 메소드 호출 -> 오버라이딩 한 메소드가 실행됨을 보장

* 오버라이딩 목적 : 다형성 실현, 하나의 인터페이스(같은 이름)에 서로 다른 구현, 슈퍼 클래스의 메소드를 서브 클래스에서 각각 목적에 맞게 다르게 구현

* 동적 바인딩 - 오버라이딩된 메소드 호출 -> superobject(키워드 아님) 하나만 있는 응용프로그램의 경우 혹은 상속받은 경우 모두 동적 바인딩을 한다. ※ 오버라이딩 메소드가 항상 호출된다. 

* super 키워드로 슈퍼 클래스의 멤버 접근 -> super.슈퍼클래스의 멤버, 서브 클래스에서만 사용, 슈퍼 클래스 메소드 호출 시 super로 이루어지는 메소드 호출 : 정적 바인딩, 슈퍼 클래스의 필드 접근

```
public class Ex51ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point(); // Point 객체 생성
        p.set(1, 2); // Point 클래스의 set() 호출
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3, 4); // Point 클래스의 set() 호출
        cp.setColor("red"); // ColorPoint 클래스의 set() 호출
        cp.showColorPoint(); // 컬러와 좌표 출력
    }
}

class Point {
    private int x, y; // 한 점을 구성하는 x, y 좌표

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
    
}
// point를 상속받은 ColorPoint 선언
class ColorPoint extends Point {
    private String color; // 점의 색

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() { // 컬러 점의 좌표 출력
        System.out.print(color);
        showPoint(); // point의 showPoint() 호출
    }
    
}
```


## 25년 4월 17일(7주차)
* 생성자(Constructor)의 종류 default, 
* this_Reference (this.member 형태로 멤버를 접근할 때 사용)
* 객체 배열(object_array)
* 메소드, 인자 전달(argument :  함수를 호출할때 전달되는 실제 값), 매개변수(parameter : 함수의 정의부분에 나열되어 있는 변수)
* 객체가 전달되는 경우는 객체의 reference만 전달 : 매개변수가 실 인자 객체 공유
* 배열이 전달되는 경우는 배열 래퍼런스만 매개 변수에 전달 : 배열 통째로 전달 되지 않음, 객체가 전달되는 경우와 동일 : 매개 변수가 실인자의 배열 공유
* 메소드 Overloading -> 매개 변수 같으면 오버로딩 실패함
* 객체 치환 -> 객체 복사X 래퍼런스 복사O
* 객체 소멸 : 할당 받은 객체와 메모리를 JVM으로 되돌려 주는 행위
* garbage : 가리키는 reference가 하나도 없는 객체
* garbage collector : 가용 메모리 공간이 일정 이하로 부족해질 때 가비지 컬렉터에 의해 자동 수행
* JAVA Package : 관련 있는 클래스파일을 저장하여 관리하는 dirctory
* 접근 지정자(Access modifiers) : private, protected, public, 디폴트(접근 지정자 생략)
* 클래스 접근 지정 : 다른 클래스에서 사용하도록 허용할 지 지정
* 멤버 접근 지정 : public -> 패키지에 관계 없이 모든 클래스에게 접근 허용
* static, non-static -> 모든 객체에 멤버 생성, static은 멤버 공유 ※ 공유 특성이 다름

```
public class Ex48ArrayParameter { // 인자로 배열이 전달되는 예 , 객체 배열도 가능함
    static void replaceSpace(char a[]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') {
                a[i] = '.';
            }
        }
    }

    static void printCharArray(char a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char c[] = {'H', 'E', 'L', 'L', 'O'};
        printCharArray(c);
        replaceSpace(c);
        printCharArray(c);
    }
}
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