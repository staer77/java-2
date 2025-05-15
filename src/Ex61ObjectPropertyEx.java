class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x; this.y = y;
    }
    
}

public class Ex61ObjectPropertyEx {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        System.out.println(p.getClass().getName()); // 클래스 이름
        System.out.println(p.hashCode()); // 해시 코드 값
        System.out.println(p.toString()); // 객체의 문제점

        // 실행 결과
        // 1d509Point
        // 804564176
        // Point@2ff4acd0
    }
}
