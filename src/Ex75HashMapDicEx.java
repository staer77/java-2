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
