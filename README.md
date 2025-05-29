# 이주환 202230126

####
1. 이름 학번 h1 제일 위에 기재
2. 날짜(주차)
3. 배운내용 & 코드
4. 최근 날짜가 제일 위로 올라오게

## 25년 5월 29일 (13주차)
* 컨테이너 : 다른 컴포넌트를 포함할 수 있는 GUI 컴포넌트, 다른 컨테이너에 포함될 수 있음, AWT, Swing
* 컴포넌트 : 컨테이너에 포함되어야 화면에 출력될 수 있는 GUI 객체, 다른 컴포넌트를 포함할 수 없는 순수 컴포넌트, 모든 GUI 컴포넌트가 상속받는 클래스, 스윙 컴포넌트가 상속받는 클래스
* 최상위 컨테이너 : 다른 컨테이너에 포함되지 않고도 화면에 출력되며, 독립적으로 존재 가능한 컨테이너, 스스로 화면에 자신을 출력하는 컨테이너 -> JFRame, JDialog, JApplet
* 최상위 컨테이너를 바닥에 깔고, 그 위에 컨테이너를 놓고, 다시 컴포넌트를 쌓아가는 방식, 즉 레고 블록을 쌓는 듯이 GUI 프로그램을 작성
* Swing GUI 프로그램 : 1. 프레임 만들기 2. main() 메소드 작성 3. 스윙 프레임에 스윙 컴포넌트 붙이기, import awt, swing 필요
* Swing 프레임 : 모든 스윙 컴포넌트를 담는 최상위 컨테이너, 스윙 프레임(JFrame) 기본 구성 : 프레임, 메뉴바, 컨텐트팬
* JFram 클래스를 상속받는 클래스 작성, 프레임 크기 반드시 지정, 프레임을 화면에 출력하는 setVisible(true) 반드시 필요
* 스윙 응용프로그램에서 main()의 기능 최소화, 시작점으로서의 기능만, 프레임을 생성하는 정도의 코드
* 프레임에 컴포넌트 붙이기 -> super()나 setTitle() 이용, 컨텐트팬(스윙 컴포넌트들이 부착되는 공간)에 컴포넌트 달기, 스윙 프레임에 붙은 디폴트 컨텐트팬 알아내기, 붙이고 변경
* JDK1.5 이전에는 반드시 컨텐트팬에 컴포넌트 부착, 그 이후에는 컴포넌트를 부착하면 프레임이 대신 컨텐트팬에 부착, 이전처럼 부착하는 것이 바람직함, 컴포넌트의 부모가 프레임이 아닌 컨텐트팬임을 명확히 사용할 필요
* Swing 응용 프로그램 종료 System.exit(0); -> 언제 어디서나 무조건 종료, 프레임과 함께 프로그램을 종료 시키는 방법 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);, 종료버튼 클릭만 하면 종료된 것이 아님
* 컨테이너와 배치, 배치관리자 개념 - 컨테이너마다 하나의 배치관리자 존재, 컨테이너에 부착되는 컴포넌트의 위치와 크기 결정, 컨테이너의 크기가 변경되면 컴포넌트의 위치와 크기 재설정
* 배치 관리자 대표 유형 4가지 - FlowLayout, BorderLayout, GridLayout, CardLayout
* 컨테이너에 새로운 배치관리자 설정 - setLayout(LayoutManager lm) 메소드 호출 lm을 새로운 배치관리자로 설정
* FlowLayout(int align, int hGap, int vGap) - 왼쪽에서 오른쪽으로 배치, 위에서 아래로 순서대로 배치, (정렬 방법 지정, 좌우 수평, 상하 수평)
* BorderLayout - add(Component comp, int index) : comp를 index의 공간에 배치 - 동 서 남 북 중앙
* GridLayout - 컨테이너 공간을 사각형 격자(그리드)로 분할하고 각 셀에 컴포넌트 하나씩 배치
* CardLayout - 여러겹으로 배치
* 배치관리자가 없는 컨테이너 - 응용프로그램에서 직접 컴포넌트의 크기와 위치를 결정하고자 하는 경우 1. 개발자 임의로 결정 2. 컴포넌트들의 위치와 크기가 수시로 변하는 경우(ex: Game) 3. 여러 컴포넌트들이 서로 겹쳐 출력하고자 하는 경우, 배치관리자 없으면 컴포넌트에 대한 어떤 배치도 없음
* void setSize(int width, int height) - 크기 조정, void setLocation(int x, int y) - 위치 설정, void setBounds(int x, int y, int width, int height) - 위치 크기 둘 다 조정

* 이벤트 기반 프로그래밍(Event Driven Programming) - 이벤트의 발생에 의해 프로그램 흐름이 결정되는 방식, 반대되는 개념은 배치 실행(bacth programming) - 프로그램의 개발자가 프로그램의 흐름을 결정하는 방식, 리스너는 이벤트가 발생했을 때 왔는지 안 왔는지 확인, 헨들러는 이벤트가 발생했을 때 실행되는 함수
* 이벤트 처리 과정 -> 발생 - 객체 생성 - 리스너 찾기 - 리스너 실행
* 이벤트 객체는 발생한 이벤트에 관학 정보를 가진 객체, 포함되는 정보는 이벤트 종류와 소스 / 발생한 화면 좌표 및 컴포넌트 내 좌표 / 버튼이나 메뉴 아이템의 문자열 / 마우스 버튼 번호 및 클릭 횟수 / 키의 코드 값과 문자 값 / 체크박스, 라디오 버튼 등과 같은 컴포넌트에 이벤트가 발생하였다면 체크 상태
* 이벤트 소스를 알아 내는 메소드 : Object getSource() 오브젝트 타입으로 리턴하므로 캐스팅(형변환)하여 사용
* 리스너 인터페이스 - 이벤트 리스너 : 이벤트를 처리하는 자바 프로그램 코드, 클래스로 작성
* 사용자 정의 리스너는 인터페이스 상속, 모든 추상 메소드(이름만 있는 메소드) 구현
* 이벤트 리스너 작성 과정 -> 선택 - 리스너 클래스 작성 - 컴포넌트에 이벤트 리스너 등록
* 이벤트 리스너 작성 방법 - 1. 독립 클래스 작성 : 리스너를 완전한 클래스로 작성 2. 내부(inner) 클래스 : 클래스 안에 또 다른 클래스, 특정 클래스 안에서 작성 3. 익명(anonymous) 클래스 작성 : 간단한 리스너 작성, 코드가 간단한 경우


```
jdk 1.5 이후 스타일
import javax.swing.*;
import java.awt.*;

public class Ex82ContentPaneEx extends JFrame {
    public Ex82ContentPaneEx() {
        setTitle("ContentPane과 JFrame 예제"); // 프레임의 타이틀 달기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane(); // 컨텐트팬 알아내기
        contentPane.setBackground(Color.ORANGE); // 오렌지색 배경 설정
        contentPane.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout

        contentPane.add(new JButton("OK")); // OK 버튼 달기기
        contentPane.add(new JButton("Cancel")); // Cancel 버튼 달기
        contentPane.add(new JButton("Ignore")); // Ignore 버튼 달기

        setSize(300,150); // 프레임 크기 300 x 150 설정
        setVisible(true); // 화면에 프레임 출력
    }

    public static void main(String[] args) {
        new Ex82ContentPaneEx();
    }
}
```

## 25년 5월 22일(12주차)
* StringBuffer class -> 가변 크기의 버퍼를 가지고 있어 문자열 수정 가능, 문자열의 수정이 많은 작업에 적합
* StringTokenizer class -> 구분 문자(delimiter, 문자열을 구분할 때 사용되는 문자)를 기준으로 문자열을 분리하는 클래스, token : 구분 문자로 분리된 문자열, & -> 구분 문자열
* csv -> comma-separated values, 쉼표로 구분된 값
* 반복 횟수가 정해지면 for문 조건이면 while문
* Math class -> 기본 산술 연산 메소드를 제공하는 클래스, 모든 메소드는 static으로 선언 - 클래스 이름으로 호출 가능, Math.random() 메소드로 난수 발생 0보다 크거나 같고 1.0보다 작은 실수 난수 발생, import.util.Random class를 이용하여 난수 발생 가능
-----------------------------------------
* Generic and Collection
* Collection = element(요소)라고 불리는 가변 개수의 객체들의 저장소 - 객체들의 컨테이너라고 불림, 요소의 개수에 따라 크기 자동 조절, 요소의 삽입 / 삭제에 따른 요소의 위치 자동 이동, 고정 크기의 배열을 다루는 어려움 해소, 다양한 객체들의 삽입 / 삭제 / 검색 등의 관리 용이
* 배열은 선언할 때 처음부터 정함, 컬렉션은 가변임(flexible)
* 컬렉션은 제네릭 기법으로 구현
* 제네릭 -> 특정 타입만 다루지 않고, 여러 종류의 타입으로 변신할 수 있도록 클래스나 메소들르 일반화 시키는 기법, 클래스나 인터페이스 이름에 <E>, <K>, <V> 등 타입 매개변수 포함
* 제네릭 컬렌션 사례 : 벡터 Vector<E>, <E>에서 E에 구체적인 타입을 주어 구체적인 타입만 다루는 벡터로 활용, 정수만 다루는 컬렉션 벡터 Vector<Integer>, 문자열만 다루는 컬렉션 벡터 Vector<String>
* 컬렉션의 요소는 객체만 가능 int, char, double 등의 기본 타입으로 구체화 불가
* 제네릭은 클래스나 메소드를 형판에서 찍어내듯이 생산할 수 있도혹 일반화된 형판을 만드는 기법, 모든 종류의 데이터 타입을 다룰 수 있도록 일반화된 타입 매개 변수로 클래스(인터페이스)나 메소드를 작성하는 기법
* Vector<E> 특성
* <E>에 사용할 요소의 특정 타입을 구체화, 배열을 가변 크기로 다룰 수 있게 하는 컨테이너(배열의 길이 제한 극복, 자동으로 길이 조절), 요소 객체들을 삽입 / 삭제 / 검색하는 컨테이너, Vector에 삽입 가능한 것(객체, null, 기본 타입 값은 Wrapper 객체로 만들어 저장), 삽입은 맨 뒤  중간에 가능, 삭제는 임의의 위체에 있는 객체 가능
* 컬렉션과 자동 박싱 / 언박싱 -> 기본 타입 데이터를 Wrapper 객체로 만들어 삽입, 컬렉션으로부터 요소를 얻어올 때, Wrapper class로 casting 필요 하지만 JDK 1.5부터는 자동 박싱 / 언박싱이 작동하여 기본 타입 값 삽입 가능 그러나 태입 매개 변수를 기본 타입으로 구체화 할 수는 없음
* 컬렉션 생성문의 진화 - java 7 이후 컴파일러의 타입 추론 기능 추가, 다이아몬드 연산자<>에 타입 배개변수 생략 java 10 이후 var 키워드 도입, 컴파일러의 지역 변수 타입 추론 가능
* ArrayList : 가변 크기 배열을 구현한 클래스 - <E>에 요소로 사용할 특정 타입으로 구체화, 벡터와 거의 동일(스레드 동기화 기능은 없음), 다수 스레드가 동시에 ArrayList에 접근할 때 동기화되지 않음, 개발자가 스레드 동기화 코드 작성
* ArrayList 와 Vector는 모두 동적으로 크기가 늘어나는 배열 기반의 리스트 클래스, ArrayList(스레드 안전X) 싱글 스레드 적합 - Vector(스레드 안전Os) 동기화로 인한 오버헤드 발생
* 컬렉션의 순차 검색을 위한 Iterator<E> 인터페이스 - 리스트 구조의 컬렉션에서 요소의 순차 검색을 위한 인터페이스, ,벡터, 어레이리스트, 링크드리스트가 상속받는 인터페이스
* Iterator 객체 얻어내기 - 컬렉션의 iterator() 메소드 호출 : 해당 컬렉션을 순차 검색할 수 있는 Iterator 객체 리턴
* Hashmap<K, V> - key / value의 쌍으로 구성되는 요소를 다루는 컬렉션, 값을 검색하기 위해서는 반드시 키 이용, 삽입 put() method / 검색 get() method
* 제네릭 클래스 작성 : 클래스 이름 옆에 일반화된 타입 매개 변수 추가, 제네릭 타입에 구체적인 타입을 지정하여 객체를 생성하는 것을 구체화라고 함
----------------------------------------------
* 자바 GUI 스윙 기초
* GUI : 그래픽으로 화면을 구성하고 i/o 장치로 입력 받을 수 있도록 지원하는 사용자 인터페이스, AWT와 Swing 패키지에 강력한 GUI 컴포넌트 제공(현재 Swing만 사용, AWT 기반임)
* AWT(Abstract windowing Toolkit) packge : heavy weight component임, 운영체제에 의해 이루어지며, 운영체제에 지원을 만이 소모하고 부담을 줌, 운영체제가 직접 그리기 때문에 속도는 빠름
* SWing : AWT 기능 + 추가된 고급 컴포넌트, AWT 컴포넌트를 모두 스윙으로 재작서으 AWT 컴포넌트 이름 앞에 J자를 덧붙임, 자바 언어로 구현, 스윙 컴퍼넌트는 light weight component임, Swing는 직접 그려서 운영체제 부담주지 않음


```
import java.util.*;

public class Ex75HashMapDicEx {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        Set<String> keys = dic.keySet(); // 모든 키를 Set 컬렉션에 받아옴옴
        Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴턴

        while(it.hasNext()) {
            String key = it.next();
            String value = dic.get(key);
            System.out.println("(" + key + "," + value + ")");
        }

    System.out.println();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("찾고 싶은 단어는?");
            String eng = scanner.next();

            String kor = dic.get(eng);

            if (kor == null) {
                System.out.println(eng + "는 없는 단어 입니다");
            } else {
                System.out.println(kor);
            }
        }
    }
}

```

## 25년 5월 15일(11주차)
* package의 운영 방법 : 기능 / 역할 별로 하위 패캐지를 구분 -> utils, controller, service 등, 디렉토리 구조와 package 선언을 정확히 일치해야 함, import는 필요한 만큼만 전체 사용은 좋지 않음.
* 모듈 개념 : 패키지와 이미지 등의 리소스를 담은 컨테이너, (.jmod)로 저장
* 자바 플랫폼의 모듈화
* 자바 모듈화의 목적은 자바 컴포넌트들을 필요에 따라 조립하여 사용하기 위함, 필요 없는 모듈이 로드 되지 않게 함
* 자바 모듈과 패키지 구조
* JDK의 주요 패키지
* Object 클래스 : 모든 자바 클래스는 반드시 Object를 상속받도록 자동 컴파일, 모든 클래스의 수퍼 클래스, 모든 클래스가 상속받는 공통 메소드 포함
* 객체 속성 -> Object 클래스는 객체의 속성을 나타내는 메소드 제공
* toString() method,객체를 문자열로 변환 -> 각 클래스는 toString()을 오버라이딩하여 자신만의 문자열 리턴 가능, 객체를 문자열로 변환
* 객체 비교(==) 와 equals() method : == 연산자 -> Object Reference 비교, boolean equals(Object obj) -> 두 객체의 내용물 비교, 객체의 내용물을 비교하기 위해 클래스의 멤버로 작성
* Wrapper class : 자바의 기본 타입을 클래스화 한 8개 클래스를 통칭, 객체만 사용할 수 있는 컬렉션 등에 기본 타입의 값을 사용하기 위해 Wrapper 객체로 만들어 사용
* boxing or unboxing -> 박싱은 기본 타입의 값을 Wrapper 객체로 변환하는 것, 언박싱은 Wrapper 객체에 들어 있는 기본 타입의 값을 빼내는 것. 박싱의 반대, 자동 박싱과 자동 언박싱 -> JDK 1.5부터 박싱과 언박싱은 자동으로 이루어지도록 컴파일됨
* String 클래스는 문자열을 나타냄, 스트링 리터럴은 String 객체로 처리됨
* 스트링 리터럴 -> JVM 내부에서 리터럴 테이블에 저장되고 관리됨, 응용프로그램에서 공유됨, String s = "Hello";, new String()으로 생성된 스트링 -> 스트링 객체는 Heep에 생성, 스트링은 공유되지 않음
* 스트링 객체의 주요 특징은 수정 불가능
* String 활용 스트링 비교에 == 연산자 절대 사용 금지, int compareTo(String anotherString) -> 문자열이 같ㅇ느면 0 리턴, 이 문자열이 anotherString 보다 먼저 나오면 음수 리턴 나중에 나오면 양수 리턴, 공백 제거, String trim()

```
class Rect {
    int width, height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Rect)) return false; // obj가 Rect 타입이 아님
        Rect p = (Rect) obj;
        return this.width * this.height == p.width * p.height;
        // Point p = (Point)obj; // obj를 Point 타입으로 다운 캐스팅
        // if (width*height == p.width * p.height) return true;
        // else return false;
    }
}

public class Ex64RectEx {
    public static void main(String[] args) {
        Rect a = new Rect(2, 3); // 면적 6
        Rect b = new Rect(2, 3); // 면적 6
        Rect c = new Rect(3, 4); // 면적 12

        if (a == b) {
            System.out.println("a == b");
        }

        if (a.equals(b)) {
            System.out.println("a is equal to b");
        }

        if (a.equals(c)) {
            System.out.println("a is equal to c");
        }
    }
}
```

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
* package 운영 방법은 패키지 이름은 도메인 기반으로 시작 -> 충돌 방지 / 모듈별 분리 가능

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