public class Ex68MathEx {
    public static void main(String[] args) {
        System.out.println(Math.abs(-3.14));  // 절댓값 구하기
        System.out.println(Math.sqrt(9.0)); // 9의 제곱근 = 3
        System.out.println(Math.exp(2));    // e2
        System.out.println(Math.round(3.14)); // 반올림림

        System.out.println("이번 주 행운의 번호는");

        for (int i = 0; i < 5; i++) {
            System.out.print((int)(Math.random() * 45 + 1) + " "); // 난수 발생
        }
    }
}

// 실행결과
// 3.14
// 3.0
// 7.38905609893065
// 3
// 이번 주 행운의 번호는
