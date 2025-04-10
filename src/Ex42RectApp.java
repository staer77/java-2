import java.util.Scanner;

class Rectangle {
    int width; // 너비
    int height; // 높이

    public int getArea() { // 면적 메소드
        return width * height;
    }
}

public class Ex42RectApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(); // 객체 생성
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> ");
        rect.width = scanner.nextInt();
        rect.height = scanner.nextInt();
        System.out.println("사각형의 면적은 " + rect.getArea());
        scanner.close();
    }
}
