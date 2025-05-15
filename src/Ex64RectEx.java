class Rect1 {
    int width, height;

    public Rect1(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Rect1)) return false; // obj가 Rect 타입이 아님
        Rect1 p = (Rect1) obj;
        return this.width * this.height == p.width * p.height;
        // Point p = (Point)obj; // obj를 Point 타입으로 다운 캐스팅
        // if (width*height == p.width * p.height) return true;
        // else return false;
    }
}

public class Ex64RectEx {
    public static void main(String[] args) {
        Rect1 a = new Rect1(2, 3); // 면적 6
        Rect1 b = new Rect1(2, 3); // 면적 6
        Rect1 c = new Rect1(3, 4); // 면적 12

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
