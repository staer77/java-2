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