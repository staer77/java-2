import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex314InputException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하시오.");
        int sum = 0, n = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println(i + ">>");

            try {
                n = scanner.nextInt(); // 정수 입력
            } catch (InputMismatchException e) { // e는 event
                System.out.println("정수가 아닙니다. 다시 입력하세요");
                scanner.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
                i--; // 인덱스 증가하지 않도록 미리 감소
                continue; // 다음 루프
            }

            sum += n;
        }

        System.out.println("합은 " + sum);
        scanner.close();
    }
}
