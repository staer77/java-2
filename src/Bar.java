/*
 * Bar.java는 상수를 이용하여 원의 면적을 계산하는 예제.
 */

public class Bar {
    public static void main(String[] args) {
        final double PI = 3.14;
        double radius = 10.2;
        double circleArea = radius * radius * PI;

        System.out.print("반지름 " + radius + ", ");
        System.out.println("원의 면적 = " + circleArea);
    }
}
