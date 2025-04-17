class Sample {
    public int a;
    private int b;
    int c;
}

public class Ex410AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        aClass.b = 10;
        aClass.c = 10;
    }
}

// a, c는 같은 패키지에 속한 클래스에서 접근 가능, b는 private으로 접근 불가능
