import java.util.StringTokenizer;

public class Ex67StringTokenizerEx {
    public static void main(String[] args) {
        String query = "name=kitae&addr=seoul&age=21";
        StringTokenizer st = new StringTokenizer(query, "&");

        int n = st.countTokens();
        System.out.println("토큰 개수 = " + n); // 분리된 토큰 개수

        while(st.hasMoreTokens()) {
            String token = st.nextToken(); // 토큰 얻기기
            System.out.println(token); // 토큰 출력력
        }
    }
}